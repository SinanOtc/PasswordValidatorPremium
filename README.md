# 🌟 Password Validator Premium

**Password Validator Premium** is a powerful Maven-based project designed to ensure password security by validating them against strict criteria. With its elegant design and solid foundation, this tool empowers users to enforce best practices for password security.

---

## 🔒 Features

Our validator ensures that passwords adhere to the following rules to maximize their strength:

- **Length**: Passwords must be **at least 8 characters long**.
- **Case Sensitivity**: At least **one uppercase letter** and **one lowercase letter** are required.
- **Numeric Inclusion**: Must include at least **one digit**.
- **Special Characters**: Must contain one of the following: `@#$%^&+=!`.
- **No Spaces**: Passwords must not contain spaces.
- **No Repeating Sequences**: Detects and rejects repeated sequences of **three or more characters**.

---

## 🛠️ Installation Guide

Follow these steps to set up and run **Password Validator Premium**:

### Prerequisites

Ensure the following are installed before starting:

1. **Java**: Version 11 or newer. Check your version using:
   ```bash
   java -version
   ```
   If not installed, download it from [Oracle's Java Downloads](https://www.oracle.com/java/technologies/javase-downloads.html) or use your system's package manager.

2. **Maven**: Ensure Maven is installed and available. Verify using:
   ```bash
   mvn -version
   ```
   If not installed, follow the instructions at [Maven Downloads](https://maven.apache.org/download.cgi).

---

### Installation Steps

#### Clone the Repository

Clone the project to your local machine using Git:

```bash
git clone https://github.com/SinanOtc/PasswordValidatorPremium.git
```

Navigate to the project directory:

```bash
cd PasswordValidatorPremium
```

#### Build the Project

Use Maven to build the project and resolve dependencies:

```bash
mvn clean install
```

This generates a JAR file in the `target` directory.

#### Run the Validator

Execute the application using the generated JAR file:

```bash
java -jar target/password-validator-premium.jar
```

---

### Test the Application

Once the application is running, you can input passwords to validate them against the security criteria. The program provides feedback on whether the password meets all requirements.

---

## 👩‍💻 About the Project

This project was developed by **Sinan** and **Theocharis** to raise the bar for password security. By enforcing strict validation rules, Password Validator Premium enables developers and users to create stronger and more secure passwords.

_Built for security, designed for the future – Password Validator Premium._

---
