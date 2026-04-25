# 🧪 Cucumber BDD Automation Framework (Selenium + TestNG)

## 📌 Project Overview

This project is a **Behavior-Driven Development (BDD)** test automation framework built using:

* Java
* Selenium WebDriver
* Cucumber
* TestNG
* Maven

It demonstrates automated testing of:

* Web UI (Login functionality)
* API scenarios
* Basic functional test cases (e.g., addition)

---

## 📂 Project Structure

```
cucumber-demo-project
│── src
│   ├── test
│   │   ├── java
│   │   │   ├── runner
│   │   │   │   └── TestRunner.java
│   │   │   ├── StepDefinitions
│   │   │   │   ├── AdditionSteps.java
│   │   │   │   ├── ApiSteps.java
│   │   │   │   ├── AppLoginSteps.java
│   │   │   │   ├── Hooks.java
│   │   │   │   ├── LoginSteps.java
│   │   │   │   ├── LoginScenarioOutlineSteps.java
│   │   │   │   ├── LoginScenarioOutline1Steps.java
│   │   │   │   └── Web_LoginPage_Steps.java
│   │   │
│   │   ├── resources
│   │   │   ├── AdditionOf2Numbers.feature
│   │   │   ├── Api.feature
│   │   │   ├── appLogin.feature
│   │   │   ├── login.feature
│   │   │   ├── LoginScenarioOutline.feature
│   │   │   ├── LoginScenarioOutline1.feature
│   │   │   └── WebLoginPage.feature
│
│── pom.xml
```

---

## 🚀 Features

* ✅ BDD framework using Cucumber
* ✅ Test execution using TestNG
* ✅ Selenium WebDriver for UI automation
* ✅ API testing support
* ✅ Scenario Outline examples
* ✅ Hooks for setup/teardown
* ✅ Cucumber HTML reports
* ✅ Allure reporting integration

---

## ⚙️ Prerequisites

Make sure you have installed:

* Java (JDK 8 or above)
* Maven
* IDE (IntelliJ recommended)
* Browser (Chrome)

---

## ▶️ How to Run Tests

### Run using Maven:

```
mvn clean test
```

### Run via TestNG:

* Execute `testng.xml` (if configured)

---

## 📊 Test Reports

### Cucumber Report

After execution, open:

```
target/cucumber-report.html
```

### Allure Report

Generate report:

```
allure serve allure-results
```

---

## 🧠 Key Concepts Used

* Cucumber Feature Files (Gherkin syntax)
* Step Definitions
* Hooks (Before/After)
* TestNG integration with Cucumber
* Page interaction using Selenium
* Data-driven testing using Scenario Outline

---

## 📌 Sample Scenarios Covered

* Login functionality (valid/invalid cases)
* API testing scenarios
* Addition of numbers
* Web login page automation

---

## 💡 Future Enhancements

* Add Page Object Model (POM)
* Integrate CI/CD (GitHub Actions / Jenkins)
* Parallel execution with TestNG
* Cross-browser testing

---

## 👩‍💻 Autho

Anuradha Sangojwar
