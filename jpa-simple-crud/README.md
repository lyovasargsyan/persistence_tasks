# JPA Simple CRUD

## Goal

Create a simple Java console application that uses JPA and PostgreSQL to manage students.

Students should practice:

```text
JPA annotations
EntityManager
EntityManagerFactory
transactions
CRUD methods
PostgreSQL connection config
Maven dependencies
```



## Database Setup

Create / use  a PostgreSQL database:

```sql
CREATE DATABASE jpa_simple_crud;
```

Update the database username and password in:

```text
src/main/resources/META-INF/persistence.xml
```

Default values:

```text
database: jpa_simple_crud
username: postgres
password: postgres
```

## Entity

The project contains one entity:

```java
Student
```

Fields:

```text
id
firstName
lastName
email
age
```

## Student Tasks

Complete the TODO methods in:

```text
src/main/java/com/example/jpa/repository/StudentRepository.java
```

Methods to implement:

```java
public Student create(Student student)
public Student findById(Long id)
public List<Student> findAll()
public Student update(Student student)
public boolean deleteById(Long id)
```

## Rules

Use only:

```text
JPA
PostgreSQL
Maven
```

Do not use:

```text
Spring
Spring Boot
Hibernate native Session API
JDBC directly
database migration tools
```

Use `EntityManager` for all CRUD work.

The Maven project includes Hibernate only as the JPA provider. Students should not use Hibernate-specific APIs in this task.

## Run From IntelliJ IDEA

Create an `Application` configuration:

- Name: `JPA Simple CRUD`
- Main class: `com.example.jpa.Main`
- Module classpath: `jpa-simple-crud`
- Working directory:

```text
/Users/tigranho/Projects/test/persistence_tasks/jpa-simple-crud
```

## Expected Practice Flow

1. Configure PostgreSQL connection.
2. Run `Main`.
3. Implement `create`.
4. Implement `findById`.
5. Implement `findAll`.
6. Implement `update`.
7. Implement `deleteById`.
8. Run the app after each method.
