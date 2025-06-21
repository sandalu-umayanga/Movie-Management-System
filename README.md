# Movie-Management-System

A simple Java-based Movie Rental Management System built with a Test-Driven Development (TDD) approach.

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Testing](#testing)
- [Design](#design)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This project is a basic Movie Rental Management System implemented in Java. It allows for managing movies, customers, and their rental history, following object-oriented principles and tested using JUnit.

---

## Features

- Add, update, and remove movies and customers
- Track movie availability and borrowing history
- Manage customer rental history
- TDD with JUnit for core logic

---

## Project Structure

```
Movie-Management-System/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── example/
│   │               ├── Main.java
│   │               ├── controller/
│   │               │   └── RentalController.java
│   │               ├── model/
│   │               │   ├── Customer.java
│   │               │   ├── Movie.java
│   │               │   └── Rental.java
│   │               └── view/
│   │                   └── Viewer.java
│   └── test/
│       └── java/
│           └── TDD/
│               ├── CustomerTest.java
│               ├── MovieTest.java
│               └── RentalTest.java
```

---

## Getting Started

### Prerequisites

- Java 21+
- Maven

### Build

Clone the repository and build with Maven:

```sh
git clone https://github.com/yourusername/Movie-Management-System.git
cd Movie-Management-System
mvn clean install
```

### Run

To run the application:

```sh
mvn exec:java -Dexec.mainClass="org.example.Main"
```

---

## Usage

The current implementation provides the core logic for managing movies and customers. You can extend the [`org.example.Main`](src/main/java/org/example/Main.java) class or implement a UI in the [`org.example.view.Viewer`](src/main/java/org/example/view/Viewer.java) class.

### Example

```java
import org.example.model.Movie;
import org.example.model.Customer;

Movie movie = new Movie("Inception", "Christopher Nolan", "Sci-Fi", "2010");
Customer customer = new Customer("Alice", "30", "alice@example.com");
movie.addCustomer(customer);
customer.addMovie(movie);
```

---

## Testing

JUnit tests are provided in the [`src/test/java/TDD`](src/test/java/TDD/) directory.

To run all tests:

```sh
mvn test
```

---

## Design

### Main Classes

- [`org.example.model.Movie`](src/main/java/org/example/model/Movie.java): Represents a movie, tracks availability and borrowing history.
- [`org.example.model.Customer`](src/main/java/org/example/model/Customer.java): Represents a customer, tracks borrowed movies and rental history.
- [`org.example.model.Rental`](src/main/java/org/example/model/Rental.java): Placeholder for rental logic.
- [`org.example.controller.RentalController`](src/main/java/org/example/controller/RentalController.java): Placeholder for business logic.
- [`org.example.view.Viewer`](src/main/java/org/example/view/Viewer.java): Placeholder for UI logic.

### TDD Approach

All core logic is covered by JUnit tests in:
- [`TDD.MovieTest`](src/test/java/TDD/MovieTest.java)
- [`TDD.CustomerTest`](src/test/java/TDD/CustomerTest.java)
- [`TDD.RentalTest`](src/test/java/TDD/RentalTest.java)

---

## Documentation

### JavaDoc

All main classes and methods are documented with JavaDoc comments.  
To generate HTML documentation, run:

```sh
mvn javadoc:javadoc
```

The generated documentation will be available in `target/site/apidocs`.

#### Example JavaDoc

```java
/**
 * Represents a movie in the rental system.
 * Tracks title, director, genre, year, availability, and borrowing history.
 */
public class Movie {
    // ...
}
```

---

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

---
