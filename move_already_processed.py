import os
import shutil

# Define the directories where you want to move the packages
already_processed_dir = "already_processed"

# Create target directories if they don't exist
os.makedirs(os.path.join(already_processed_dir, "src/main/java"), exist_ok=True)
os.makedirs(os.path.join(already_processed_dir, "src/test/java"), exist_ok=True)

# Function to move package directories
def move_package(package_path, target_dir):
    source_package_path = os.path.join("src/main/java", package_path)
    target_package_path = os.path.join(target_dir, source_package_path)
    
    moved = False

    if os.path.exists(source_package_path):
        os.makedirs(os.path.dirname(target_package_path), exist_ok=True)
        shutil.move(source_package_path, target_package_path)
        moved = True
        
    source_test_package_path = os.path.join("src/test/java", package_path)
    target_test_package_path = os.path.join(target_dir, source_test_package_path)
    
    if os.path.exists(source_test_package_path):
        os.makedirs(os.path.dirname(target_test_package_path), exist_ok=True)
        shutil.move(source_test_package_path, target_test_package_path)
        moved = True

    return moved

# Parse the Surefire reports and move packages
report_count = 0
packages_moved = 0

for root, dirs, files in os.walk("cleaned_up/surefire-reports"):
    for file in files:
        if file.endswith("_Test.txt"):
            report_count += 1
            file_name = file[:-9]  # Remove the "_Test.txt" suffix
            package_parts = file_name.split(".")[:-1]  # Exclude the last part (class name)
            package = ".".join(package_parts)
            if move_package(package.replace(".", "/"), already_processed_dir):
                packages_moved += 1

print(f"Number of reports found: {report_count}")
print(f"Number of packages moved successfully: {packages_moved}")