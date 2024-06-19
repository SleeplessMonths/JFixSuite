#!/bin/bash

# Directory to store individual test logs
mkdir -p target/test-logs

# List all test classes
test_classes=$(find src/test/java -name "*Test.java" | sed 's/src\/test\/java\///;s/\.java//;s/\//\./g')

# Define a function to run a test class and save its log
run_test_class() {
    local test_class=$1
    echo "Running test: $test_class"
    mvn -B -Dtest=$test_class -DargsLine="-Xmx1G" test > target/test-logs/${test_class}.log 2>&1
    
    # Check for heap dump or GC logs indicating issues
    if grep -q "OutOfMemoryError" target/test-logs/${test_class}.log || grep -q "GC overhead limit exceeded" target/test-logs/${test_class}.log; then
        echo "Heap issue detected in $test_class"
    fi
}

# Export the function so it's available in child processes
export -f run_test_class

# Run each test class in parallel
echo "$test_classes" | xargs -n 1 -P 8 bash -c 'run_test_class "$@"' _
