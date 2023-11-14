# Financial-Health-Calculator


The Financial Health Calculator is a Spring Boot application that allows users to input their monthly income, expenses, debts, and assets. Based on this input, the application calculates a Financial Health Score and provides suggestions for the user's financial health.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Features

- **User Registration:** Users can register by providing their information, which is stored in the database.
- **Financial Health Calculation:** Users can input their financial details, and the application calculates a Financial Health Score based on a predefined formula.
- **Score Interpretation:** The application interprets the Financial Health Score and redirects the user to a page indicating whether their financial health is poor, moderate, or rich.
- **Database Integration:** User and financial data are stored in a database using Spring Data JPA repositories.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- Spring Boot

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/financial-health-calculator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd financial-health-calculator
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   java -jar target/finhelcal-0.0.1-SNAPSHOT.jar
   ```

## Usage

1. Access the application at [http://localhost:8080](http://localhost:8080).
2. Register a new user on the "Registration" page.
3. Log in and navigate to the "Financial Health Calculator" page to input financial details.
4. The application will calculate the Financial Health Score and provide suggestions based on the result.

## Contributing

We welcome contributions! Feel free to open issues or submit pull requests. Please follow the guidelines in the [CONTRIBUTING.md](CONTRIBUTING.md) file.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- Special thanks to the Spring Boot community for providing a robust framework.
- Contributors to libraries and tools used in this project.
