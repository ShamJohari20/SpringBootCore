<h1 align="center">SPRING BOOT CORE</h1>
<p align="center"><i>Accelerating Development with Spring Boot Simplicity</i></p>

<p align="center">
  <b>Built with the tools and technologies:</b><br><br>
  <img src="https://img.shields.io/badge/Java-21-blue.svg" alt="Java">
  <img src="https://img.shields.io/badge/SpringBoot-3.2.4-brightgreen.svg" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Maven-3.8.4-blue.svg" alt="Maven">
</p>

---

## Table of Contents

- [Overview](#overview)
- [Projects Included](#projects-included)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Author](#author)

---

## Overview

**Spring Boot Core** is a curated set of beginner-to-intermediate level projects that showcase key Spring Boot fundamentals.  
It focuses on **auto-configuration**, **starter dependencies**, and the **simplified setup** that Spring Boot provides for building production-ready applications faster and with minimal configuration.

### Why Spring Boot Core?

This collection helps Java developers to:

- 🚀 Quickly build Spring-based applications  
- 🧩 Understand auto-configuration and embedded servers  
- ⚙️ Explore common use-cases like REST APIs, dependency injection, scheduling, database access, and more  
- 🔧 Learn development patterns using real project examples  

---

## Projects Included

| Project Folder Name                                         | Description                                                      |
|-------------------------------------------------------------|------------------------------------------------------------------|
| `SBProj01-SeasonFinder`                                     | REST API to determine season based on month                      |
| `SBProj02-WishMessageGenerator`                             | Spring Boot app that returns wish messages                       |
| `SBProj03-WeekDayFinder`                                    | Determines the weekday for a given date                          |
| `SBProj04-DependencyInjectionApplication`                   | Demonstrates Spring Boot Dependency Injection basics             |
| `SBProj05-DependencyInjectionApplicationWithSolvingAmbiguityUsingPropertyFileAndXmlFile` | Solving dependency ambiguity using property file & XML           |
| `SBProj06-DependencyInjectionApplicationSolvingAmbiguityProblemUsingFactoryBeanInterfaceSupport` | Ambiguity resolution using `FactoryBean` interface support       |
| `SBProj07-Scedulling`                                       | Introduction to scheduling tasks in Spring Boot                  |
| `SBProj08-ScedullingCorn`                                   | Advanced scheduling with Cron expressions                        |
| `SBProj09-MiniProjectEmployeeDataLayeredApp`                | Employee management mini-project with layered architecture       |
| `SBProj10-SendMailApplication`                              | Sending emails with Spring Boot Mail support                     |
| `SBProj11-MiniProjectEmployeeDataLayeredAppWithMySQL`       | Employee layered app integrated with MySQL database              |
| `SBProj12-MiniProjectEmployeeDataLayeredAppWithOracleMySQLWithFactoryBean` | Employee layered app with Oracle/MySQL using FactoryBean         |
| `SBProj13-SpringDataMongoDB`                                | CRUD operations using Spring Data MongoDB                        |
| `SBProj14-SPELWithValue`                                    | Demonstrating Spring Expression Language (SpEL) with `@Value`    |

---

## Technologies Used

- **Java 21**
- **Spring Boot 3.2.4**
- **Spring Web**
- **Spring Context**
- **Spring Mail**
- **Spring Data JPA**
- **Spring Data MongoDB**
- **Maven** (for build and dependency management)
- **Spring Initializr**
- **IDE**: IntelliJ IDEA / Eclipse / Spring Tool Suite

---

## Getting Started

### Prerequisites

Make sure you have the following tools installed:

- **Java JDK 21+**
- **Maven 3.6+**
- **IDE**: IntelliJ IDEA / Eclipse / Spring Tool Suite

### Installation

Clone the repository and install dependencies:

```sh
# Clone the repository
git clone https://github.com/ShamJohari20/Spring-Core

# Navigate to the desired project folder, for example:
cd SBProj01-SeasonFinder

# Build the project
mvn clean install

# Run the Spring Boot application
mvn spring-boot:run

# You can run unit tests using
mvn test


```
##  Author

**Sham Johari**  
[GitHub](https://github.com/ShamJohari20)

---
