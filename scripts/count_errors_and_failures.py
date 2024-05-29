import os
import re

def count_test_results(report_dir):
    total_errors = 0
    total_no_errors_failures = 0
    summary_file = "test_summary.txt"

    # Clear the summary file
    with open(summary_file, 'w') as f:
        pass

    # Regular expressions to match the error patterns
    error_pattern = re.compile(r"Errors: [1-9]")
    no_errors_failures_pattern = re.compile(r"Failures: 0, Errors: 0")

    # Traverse the report directory and process each report
    for root, _, files in os.walk(report_dir):
        for file in files:
            if file.endswith(".txt"):
                report_path = os.path.join(root, file)
                with open(report_path, 'r') as report:
                    content = report.read()
                    if error_pattern.search(content):
                        total_errors += 1
                        with open(summary_file, 'a') as summary:
                            summary.write(f"Errors: {report_path}\n")
                    elif no_errors_failures_pattern.search(content):
                        total_no_errors_failures += 1
                        with open(summary_file, 'a') as summary:
                            summary.write(f"No errors and no failures: {report_path}\n")

    # Output the results
    with open(summary_file, 'a') as summary:
        summary.write(f"Total tests with errors: {total_errors}\n")
        summary.write(f"Total tests no failures: {total_no_errors_failures}\n")

    print(f"Total tests with errors: {total_errors}")
    print(f"Total tests no failures: {total_no_errors_failures}")

if __name__ == "__main__":
    report_directory = "target/surefire-reports"
    count_test_results(report_directory)