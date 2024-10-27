import os
import shutil
import filecmp
from difflib import unified_diff

def count_line_differences(diff_lines):
    count = 0
    in_change = False
    change_type = None

    for line_idx in range(len(diff_lines) - 1):
        current_line = diff_lines[line_idx]
        next_line = diff_lines[line_idx + 1]

        if current_line.startswith('-') and next_line.startswith('+'):
            if not in_change:
                count += 1
                in_change = True
                change_type = 'removed_added'
            elif change_type == 'removed_added':
                continue  # Skip additional changes if it's already a removed_added change
            else:
                count += 1
                change_type = 'multiple'
        elif current_line.startswith('-'):
            if not in_change:
                count += 1
                in_change = True
                change_type = 'removed'
            elif change_type == 'removed':
                continue  # Skip additional changes if it's already a removed change
            else:
                count += 1
                change_type = 'multiple'
        elif next_line.startswith('+'):
            if not in_change:
                count += 1
                in_change = True
                change_type = 'added'
            elif change_type == 'added':
                continue  # Skip additional changes if it's already an added change
            else:
                count += 1
                change_type = 'multiple'
        else:
            in_change = False
            change_type = None

    return count, change_type

def move_files_to_fault_directory(file_pairs, fault_dir, folder1, folder2):
    accepted_fault_dir = os.path.join(fault_dir, 'accepted_programs')
    buggy_fault_dir = os.path.join(fault_dir, 'buggy_programs')

    if not os.path.exists(accepted_fault_dir):
        os.makedirs(accepted_fault_dir)
    if not os.path.exists(buggy_fault_dir):
        os.makedirs(buggy_fault_dir)

    for file1, file2 in file_pairs:
        relative_path_accepted = os.path.relpath(file1, folder1)
        relative_path_buggy = os.path.relpath(file2, folder2)

        destination_path_accepted = os.path.join(accepted_fault_dir, relative_path_accepted)
        destination_path_buggy = os.path.join(buggy_fault_dir, relative_path_buggy)

        destination_folder_accepted = os.path.dirname(destination_path_accepted)
        destination_folder_buggy = os.path.dirname(destination_path_buggy)

        if not os.path.exists(destination_folder_accepted):
            os.makedirs(destination_folder_accepted)
        if not os.path.exists(destination_folder_buggy):
            os.makedirs(destination_folder_buggy)

        # Move files
        shutil.move(file1, destination_path_accepted)
        shutil.move(file2, destination_path_buggy)

def delete_empty_folders(start_dir):
    for root, dirs, files in os.walk(start_dir, topdown=False):
        for dir in dirs:
            full_dir_path = os.path.join(root, dir)
            if not os.listdir(full_dir_path):
                os.rmdir(full_dir_path)

def compare_folders(folder1, folder2, fault_dir):
    files_with_multiple_faults = []

    for dirpath, dirnames, filenames in os.walk(folder1):
        for filename in filenames:
            file1 = os.path.join(dirpath, filename)
            relative_path = os.path.relpath(file1, folder1)
            file2 = os.path.join(folder2, relative_path)

            if os.path.exists(file2):
                if not filecmp.cmp(file1, file2, shallow=False):
                    with open(file1, 'r', encoding='utf-8') as f1, open(file2, 'r', encoding='utf-8') as f2:
                        f1_lines = f1.readlines()
                        f2_lines = f2.readlines()

                    diff = list(unified_diff(f1_lines, f2_lines, fromfile=file1, tofile=file2))

                    # Filter out the header lines (--- and +++)
                    diff_lines = [line for line in diff if not line.startswith('---') and not line.startswith('+++') and not line.startswith('@@') and (line.startswith('+') or line.startswith('-'))]

                    diff_count, change_type = count_line_differences(diff_lines)

                    if diff_count > 1:
                        files_with_multiple_faults.append((file1, file2))

    move_files_to_fault_directory(files_with_multiple_faults, fault_dir, folder1, folder2)
    delete_empty_folders(folder1)
    delete_empty_folders(folder2)

if __name__ == '__main__':
    folder1 = 'accepted_programs'
    folder2 = 'buggy_programs'
    fault_dir = 'multiple_faults'

    compare_folders(folder1, folder2, fault_dir)
