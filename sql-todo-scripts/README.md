# SQL TODO Scripts

## Goal

Practice PostgreSQL SQL scripts before moving deeper into JPA, Hibernate, and JDBC.

Students should create SQL manually inside the `sql/` folder.

This module contains only TODO scripts. The SQL solutions are intentionally not implemented.

## Database

Create a PostgreSQL database for this task:

```sql
CREATE DATABASE sql_todo_tasks;
```

Then connect to it from IntelliJ IDEA Database tool, DBeaver, pgAdmin, or `psql`.

## Project Structure

```text
sql-todo-scripts/
├── README.md
├── pom.xml
└── sql/
    ├── 01_create_tables.sql
    ├── 02_constraints.sql
    ├── 03_relationships.sql
    ├── 04_insert_values.sql
    ├── 05_modify_tables.sql
    └── 06_select_practice.sql
```

## Task Theme

Build a small school database.

Main tables:

```text
students
courses
teachers
enrollments
```

## Student Tasks

Complete the SQL files in order:

1. `01_create_tables.sql`
   Create base tables and columns.

2. `02_constraints.sql`
   Add primary keys, NOT NULL, UNIQUE, CHECK, and DEFAULT constraints.

3. `03_relationships.sql`
   Add foreign keys between tables.

4. `04_insert_values.sql`
   Insert sample students, teachers, courses, and enrollments.

5. `05_modify_tables.sql`
   Practice `ALTER TABLE`, add columns, rename columns, and change constraints.

6. `06_select_practice.sql`
   Practice simple select queries after the data exists.

## Rules

Use PostgreSQL SQL only.

Do not use:

```text
JPA
Hibernate
JDBC
Spring
Java code
```

## Recommended Run Order

Run scripts in this order:

```text
01_create_tables.sql
02_constraints.sql
03_relationships.sql
04_insert_values.sql
05_modify_tables.sql
06_select_practice.sql
```

