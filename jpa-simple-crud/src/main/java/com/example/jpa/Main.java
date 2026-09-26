package com.example.jpa;

import com.example.jpa.entity.Student;
import com.example.jpa.repository.StudentRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();

        Student student = new Student("John", "Smith", "john@test.com", 21);

        System.out.println("Create student:");
        Student savedStudent = repository.create(student);
        System.out.println(savedStudent);

        System.out.println();
        System.out.println("Find all students:");
        List<Student> students = repository.findAll();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println();
        System.out.println("Find student by id:");
        Student foundStudent = repository.findById(savedStudent.getId());
        System.out.println(foundStudent);

        System.out.println();
        System.out.println("Update student:");
        savedStudent.setAge(22);
        Student updatedStudent = repository.update(savedStudent);
        System.out.println(updatedStudent);

        System.out.println();
        System.out.println("Delete student:");
        boolean deleted = repository.deleteById(savedStudent.getId());
        System.out.println("Deleted: " + deleted);
    }
}
