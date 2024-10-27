#!/bin/bash

# Base directory
BASE_DIR="C4BJ/projects/java_6"

# Absolute path to the lib directory (modify as needed)
LIB_DIR="$(pwd)/lib/flacoco-1.0.7-SNAPSHOT-jar-with-dependencies.jar"

# Iterate over all "problem" directories in the base directory
for PROBLEM_DIR in "$BASE_DIR"/*/; do
  # Iterate over all "subId" directories in each "problem" directory
  for SUB_ID_DIR in "$PROBLEM_DIR"/*/; do
    # Ensure the directory exists (to avoid any hidden or non-directory files)
    if [ -d "$SUB_ID_DIR" ]; then
      # Construct the full project path and output path
      PROJECT_PATH="$SUB_ID_DIR"
      OUTPUT_PATH="${SUB_ID_DIR}flacoco_results.csv"

      # Navigate to the subId directory and run mvn clean test
      (cd "$PROJECT_PATH" && mvn clean test)

      # Run the Java command from the original directory using absolute paths
      java -cp "$LIB_DIR" fr.spoonlabs.flacoco.cli.FlacocoMain --projectpath "$PROJECT_PATH" --output "$OUTPUT_PATH"

      echo "Processed $PROJECT_PATH"
    fi
  done
done
