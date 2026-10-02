package com.example.jpa.repository;

import com.example.jpa.entity.Student;
import com.example.jpa.util.JpaUtil;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public Student create(Student student) {
        // TODO:
        // 1. Create EntityManager.
        // 2. Begin transaction.
        // 3. Save student using persist().
        // 4. Commit transaction.
        // 5. Close EntityManager.
        // 6. Return saved student.
        EntityManager entityManager = JpaUtil.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return student;
    }

    public Student findById(Long id) {
        // TODO:
        // 1. Create EntityManager.
        // 2. Find Student by id.
        // 3. Close EntityManager.
        // 4. Return found Student.
        // Return null if student does not exist.
        EntityManager entityManager = JpaUtil.createEntityManager();
        Student student = entityManager.find(Student.class, id);
        entityManager.close();
        return student;
    }

    public List<Student> findAll() {
        // TODO:
        // 1. Create EntityManager.
        // 2. Write JPQL query.
        // 3. Return all students.
        // 4. Close EntityManager.
        EntityManager entityManager = JpaUtil.createEntityManager();
        List<Student> students = entityManager.createQuery("SELECT s FROM Student s").getResultList();
        entityManager.close();
        return students;
    }

    public Student update(Student student) {
        // TODO:
        // 1. Create EntityManager.
        // 2. Begin transaction.
        // 3. Update student using merge().
        // 4. Commit transaction.
        // 5. Close EntityManager.
        // 6. Return updated student.
        EntityManager entityManager = JpaUtil.createEntityManager();
        entityManager.getTransaction().begin();
        Student updatedStudent = entityManager.merge(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return updatedStudent;
    }

    public boolean deleteById(Long id) {
        // TODO:
        // 1. Create EntityManager.
        // 2. Begin transaction.
        // 3. Find Student by id.
        // 4. Remove student if found.
        // 5. Commit transaction.
        // 6. Close EntityManager.
        // 7. Return true if removed.
        EntityManager entityManager = JpaUtil.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = findById(id);
        if(student!=null) {
            entityManager.remove(student);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    private void rollbackIfActive(EntityManager entityManager) {
        // TODO:
        // Check whether transaction is active.
        // Roll back the transaction if it is active.
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
    }
}

