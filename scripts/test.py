import os
import subprocess

# Directory to store individual test logs
log_dir = 'target/test-logs'
os.makedirs(log_dir, exist_ok=True)

# Function to find all test classes
def find_test_classes(root_dir):
    test_classes = []
    for root, _, files in os.walk(root_dir):
        for file in files:
            if file.endswith("Test.java"):
                class_path = os.path.join(root, file)
                class_name = class_path.replace('src/test/java/', '').replace('.java', '').replace(os.path.sep, '.')
                test_classes.append(class_name)
    return test_classes

# Find all test classes in src/test/java
test_classes = find_test_classes('src/test/java')

# JVM options to monitor heap usage
jvm_options = "-Xmx1024m -Xms512m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:target/gc.log -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=target/"

# Timeout in seconds
timeout_seconds = 300  # Adjust as needed

# Run each test individually
heap_issues = []
for test_class in test_classes:
    print(f"Running test: {test_class}")
    log_file = os.path.join(log_dir, f"{test_class}.log")
    
    # Run the test and log output
    try:
        with open(log_file, 'w') as log:
            result = subprocess.run(
                ['mvn', 'test', f'-Dtest={test_class}', f'-DargLine={jvm_options}'],
                stdout=log,
                stderr=subprocess.STDOUT,
                timeout=timeout_seconds
            )
    except subprocess.TimeoutExpired:
        print(f"Test {test_class} timed out")
        heap_issues.append(test_class)
        continue
    
    # Check log for heap usage issues
    with open(log_file, 'r') as log:
        log_content = log.read()
        if "OutOfMemoryError" in log_content or "GC overhead limit exceeded" in log_content:
            print(f"Heap issue detected in {test_class}")
            heap_issues.append(test_class)

# Summary of tests with heap issues
if heap_issues:
    print("Tests with heap usage issues or timeouts:")
    for issue in heap_issues:
        print(f"- {issue}")
else:
    print("No heap usage issues detected.")
