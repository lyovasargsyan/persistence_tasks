-- SQL TODO Task 02: Constraints
--
-- Goal:
-- Add constraints to the tables created in 01_create_tables.sql.
--
-- TODO:
-- Add primary key constraints.
alter table students
add primary key (id);

alter table teachers
add primary key (id);

alter table courses
add primary key (id);

alter table enrollments
add primary key (id);


-- TODO:
-- Add NOT NULL constraints for required columns.

alter table students
    alter column first_name set not null;
alter table students
    alter column last_name set not null;
alter table students
    alter column email set not null;
alter table students
    alter column age set not null;
alter table students
    alter column created_at set not null;

alter table teachers
    alter column first_name set not null;
alter table students
    alter column last_name set not null;
alter table students
    alter column email set not null;
alter table students
    alter column hire_date set not null;

alter table courses
    alter column name set not null;
alter table students
    alter column description set not null;
alter table students
    alter column price set not null;
alter table students
    alter column teacher_id set not null;
alter table students
    alter column created_at set not null;

alter table enrollments
    alter column student_id set not null;
alter table students
    alter column course_id set not null;
alter table students
    alter column enrollment_date set not null;
alter table students
    alter column status set not null;


-- TODO:
-- Add UNIQUE constraints.
-- Example ideas:
-- students.email should be unique.
-- teachers.email should be unique.
-- courses.name should be unique.

alter table students
add constraint stud

-- TODO:
-- Add CHECK constraints.
-- Example ideas:
-- students.age must be greater than 0.
-- courses.price must be greater than or equal to 0.


-- TODO:
-- Add DEFAULT values.
-- Example ideas:
-- students.created_at should default to current timestamp.
-- courses.created_at should default to current timestamp.
-- enrollments.enrollment_date should default to current date.
-- enrollments.status should default to 'ACTIVE'.

