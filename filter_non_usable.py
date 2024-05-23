import os
import shutil
import re

# Define the directories where you want to move the packages
no_failures_dir = "no_failures"
throws_errors_dir = "throws_errors"

# Create target directories if they don't exist
for directory in [no_failures_dir, throws_errors_dir]:
    os.makedirs(os.path.join(directory, "src/main/java"), exist_ok=True)
    os.makedirs(os.path.join(directory, "src/test/java"), exist_ok=True)

# Function to move package directories
def move_package(package_path, target_dir):
    source_package_path = os.path.join("src/main/java", package_path)
    target_package_path = os.path.join(target_dir, source_package_path)
    
    if os.path.exists(source_package_path):
        shutil.move(source_package_path, target_package_path)
    else:
        print(f"Source package '{source_package_path}' does not exist.")
        
    source_test_package_path = os.path.join("src/test/java", package_path)
    target_test_package_path = os.path.join(target_dir, source_test_package_path)
    
    if os.path.exists(source_test_package_path):
        shutil.move(source_test_package_path, target_test_package_path)
    else:
        print(f"Source test package '{source_test_package_path}' does not exist.")

# Parse the Surefire reports to classify packages
packages = {}
for root, dirs, files in os.walk("target/surefire-reports"):
    for file in files:
        if file.endswith("_Test.txt"):
            file_name = file[:-8]  # Remove the "_Test.txt" suffix
            package_parts = file_name.split(".")[:-1]  # Exclude the last part (class name)
            package = ".".join(package_parts)
            report_path = os.path.join(root, file)
            with open(report_path, "r") as f:
                report_content = f.read()
                if "Failures: 0, Errors: 0" in report_content:
                    packages[package] = "no_failures"
                else:
                    match = re.search(r"Errors: (\d+)", report_content)
                    if match:
                        error_count = int(match.group(1))
                        if error_count > 0:
                            packages[package] = "throws_errors"


# Move packages based on classification
for package, classification in packages.items():
    target_dir = no_failures_dir if classification == "no_failures" else throws_errors_dir
    move_package(package.replace(".", "/"), target_dir)

print("Packages moved successfully.")
