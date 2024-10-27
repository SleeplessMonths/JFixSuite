# JFixSuite
JFixSuite is a test suite derived from [Code4Bench](https://github.com/code4bench/Code4Bench) for the purpose of analyzing program repair techniques. This contains 2666 buggy programs in Java versions 6, 7 and 8 with single line bugs and give the wrong answer on test. It also contains tests, and "correct" versions for each buggy program.

Scripts were used to filter out cases that weren't fit to be used. The IDs of cases that were filtered out are stored in `problematic_subId.txt` and `C4BJ/filtered_subIds/list.txt`

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

## Usage
In the root folder there are python scripts that were used to clean up test files after running mvn test.

### Unzipping Required Files
To unzip the files in `C4BJ/src.zip`, follow these steps:

Ensure that `src.zip` is in the `C4BJ directory` of the cloned repository.

Unzip the file using the following command:

```bash
unzip C4BJ/src.zip
```

This command will extract the contents of the zip file.

## License
JFixSuite is dervied from the [Code4Bench](https://github.com/code4bench/Code4Bench) project which is distributed under the terms of the Creative Commons Attribution 4.0 International license.

You are free to:

- **Share**: copy and redistribute the material in any medium or format
- **Adapt**: remix, transform, and build upon the material for any purpose, even commercially.

Under the following terms:

- **Attribution**: You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.

For more details, refer to the [Creative Commons Attribution 4.0 International license](https://creativecommons.org/licenses/by/4.0/).