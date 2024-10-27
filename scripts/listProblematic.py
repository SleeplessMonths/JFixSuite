import os
import re

# Define the directories to search
directories = {
    'throws_errors': 'throws_errors/src/main/',
    'no_failures': 'no_failures/src/main/',
    'manually_check_problematic': 'manually_check_problematic/src/main/',
    'multiple_faults':  'multiple_faults/buggy_programs/src/'
}

# Regex to match folders like subId_<#>
pattern = re.compile(r'subId_(\d+)')

# Result storage
results = {}

def find_subId_folders(base_path, folder_name):
    folder_path = os.path.join(base_path, folder_name)
    subId_numbers = []

    for root, dirs, _ in os.walk(folder_path):
        for dir_name in dirs:
            match = pattern.match(dir_name)
            if match:
                subId_numbers.append(int(match.group(1)))  # Extract the number part

    return sorted(subId_numbers)  # Return sorted list of numbers

# Go through each category and find matching folders
for category, path in directories.items():
    subId_folders = find_subId_folders('', path)
    results[category] = subId_folders

# Write the results to a text file
with open('subId_folders.txt', 'w') as f:
    for category, numbers in results.items():
        f.write(f"{category}:\n")
        for number in numbers:
            f.write(f"{number}\n")
        f.write("\n")

print("Results have been written to subId_folders.txt")
