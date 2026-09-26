# JDBC Simple CRUD

## Goal

Create a simple Java console application that uses JDBC and PostgreSQL to manage books.

Students should practice:

```text
JDBC
Connection
PreparedStatement
ResultSet
SQL CRUD
PostgreSQL connection config
Maven dependencies
try-with-resources
```

No Spring, JPA, or Hibernate is used.

The project structure and configuration are already created. The main JDBC logic is intentionally left incomplete.

## Database Setup

Create a PostgreSQL database:

```sql
CREATE DATABASE jdbc_simple_crud;
```

Create the table manually:

```sql
CREATE TABLE books (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    isbn VARCHAR(30) NOT NULL UNIQUE,
    price NUMERIC(10, 2) NOT NULL CHECK (price >= 0)
);
```

Update database connection values in:

```text
src/main/resources/database.properties
```

Default values:

```text
database: jdbc_simple_crud
username: postgres
password: postgres
```

## Model

The project contains one model:

```java
Book
```

Fields:

```text
id
title
author
isbn
price
```

## Student Tasks

Complete the TODO methods in:

```text
src/main/java/com/example/jdbc/repository/BookRepository.java
```

Methods to implement:

```java
public Book create(Book book)
public Book findById(Long id)
public List<Book> findAll()
public Book update(Book book)
public boolean deleteById(Long id)
```

## Rules

Use only:

```text
JDBC
PostgreSQL
Maven
```

Do not use:

```text
JPA
Hibernate
Spring
Spring Boot
ORM frameworks
```

Use `PreparedStatement` for SQL queries. Do not concatenate user values into SQL strings.

## Run From IntelliJ IDEA

Create an `Application` configuration:

- Name: `JDBC Simple CRUD`
- Main class: `com.example.jdbc.Main`
- Module classpath: `jdbc-simple-crud`
- Working directory:

```text
/Users/tigranho/Projects/test/persistence_tasks/jdbc-simple-crud
```

## Expected Practice Flow

1. Create the PostgreSQL database.
2. Create the `books` table.
3. Configure `database.properties`.
4. Run `Main`.
5. Implement `create`.
6. Implement `findById`.
7. Implement `findAll`.
8. Implement `update`.
9. Implement `deleteById`.
10. Run the app after each method.

