# Java_Selenium_Repo

This repository serves as a portfolio of my learning and practical projects in test automation. It documents my journey from foundational concepts to building a robust, reusable automation framework using **Java** and **Selenium WebDriver**.

The repository is structured to reflect my learning path, making it easy to navigate through notes, fundamental Java exercises, and practical automation projects.

---

## 📂 Repository Structure

The content is organized into three main folders:

* **`01_Notes_Material`**: Contains notes and educational resources on basic and advanced Selenium commands.
* **`02_java_learning`**: My practice projects and code examples focused on mastering core Java concepts.
* **`03_Selenium_Maven`**: My primary test automation framework. This is a practical project built with industry best practices like the Page Object Model (POM).

---

## 🛠️ Project: Selenium & Maven

This section provides details about the test automation framework found in the **`03_Selenium_Maven`** folder.

### Key Technologies

* **Java**: The primary programming language.
* **Selenium WebDriver**: The core library for browser automation.
* **TestNG**: A testing framework for structuring test cases and suites.
* **Maven**: Used for build automation and managing project dependencies.
* **Page Object Model (POM)**: A design pattern implemented for creating maintainable and reusable page objects.

### Getting Started

To run the tests in this project, you will need to have the following installed:

* **Java Development Kit (JDK) 8 or higher**
* **Maven**

### How to Run the Tests

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/Java_Selenium_Repo.git](https://github.com/your-username/Java_Selenium_Repo.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd Java_Selenium_Repo/03_Selenium_Maven
    ```
3.  **Update your WebDriver path:**
    * In the `src/test/java/utilities/DriverManager.java` file, update the `System.setProperty` line with the correct path to your browser's WebDriver executable (e.g., `chromedriver.exe`).
4.  **Execute the tests using Maven:**
    ```bash
    mvn clean test
    ```
    This command will download dependencies, compile the code, and run the tests defined in the `testng.xml` file.

---

## ✨ What's Next

I will continue to update this repository with new test cases, more advanced framework features (e.g., test data handling, reporting), and additional projects as I continue to learn.
