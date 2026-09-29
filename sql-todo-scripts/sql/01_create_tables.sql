-- SQL TODO Task 01: Create Tables
--
-- Goal:
-- Create the base tables for a small school database.
--
-- Tables to create:
-- 1. students
-- 2. teachers
-- 3. courses
-- 4. enrollments

--
-- TODO:
-- Create table: students
-- Suggested columns:
-- id
-- first_name
-- last_name
-- email
-- age
-- created_at
create table students(
    id integer,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(255),
    age integer,
    created_at date
);

-- TODO:
-- Create table: teachers
-- Suggested columns:
-- id
-- first_name
-- last_name
-- email
-- hire_date
create table teachers(
    id integer,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(255),
    hire_date date
);

-- TODO:
-- Create table: courses
-- Suggested columns:
-- id
-- name
-- description
-- price
-- teacher_id
-- created_at
create table courses(
    id integer,
    name varchar(50),
    description varchar,
    price integer,
    teacher_id integer,
    created_at date
);

-- TODO:
-- Create table: enrollments
-- Suggested columns:
-- id
-- student_id
-- course_id
-- enrollment_date
-- status

create table enrollments(
    id integer,
    student_id integer,
    course_id integer,
    enrollment_date date,
    status varchar
);