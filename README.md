# JFixSuite
JFixSuite is a test suite derived from [Code4Bench](https://github.com/code4bench/Code4Bench) for the purpose of analyzing program repair techniques. This contains 6990 programs in Java versions 6, 7 and 8 with single line bugs and give the wrong answer on test.

## Requirements

- **JDK 8**: Make sure you have JDK 8 installed.
- **Maven**: Ensure you have Maven installed. You can download it from [here](https://maven.apache.org/download.cgi).

## Installation

### Cloning the Repository

To clone the repository, use the following command:

```bash
git clone https://github.com/Autonymic/JFixSuite.git
cd JFixSuite
```

### Unzipping Required Files
The provided JFixSuite.zip contains the test suite files in the src folder, as well as a filtered_packages folder containing files that, for various reasons, were deemed as unfit for the test suite.

To unzip the files, follow these steps:

Ensure JFixSuite_files.zip is in the root directory of the cloned repository.
Unzip the file using the following command:

```bash
unzip JFixSuite_files.zip
```

This command will extract the contents of the zip file.

## Usage
In the root folder there are 3 python scripts that are used to clean up test files after running mvn test.

## License
JFixSuite is dervied from the [Code4Bench](https://github.com/code4bench/Code4Bench) project which is distributed under the terms of the Creative Commons Attribution 4.0 International license.

You are free to:

- **Share**: copy and redistribute the material in any medium or format
- **Adapt**: remix, transform, and build upon the material for any purpose, even commercially.

Under the following terms:

- **Attribution**: You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.

For more details, refer to the [Creative Commons Attribution 4.0 International license](https://creativecommons.org/licenses/by/4.0/).