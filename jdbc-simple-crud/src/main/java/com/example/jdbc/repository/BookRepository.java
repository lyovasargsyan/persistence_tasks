package com.example.jdbc.repository;

import com.example.jdbc.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public Book create(Book book) {
        // TODO:
        // 1. Create SQL INSERT query.
        // 2. Open Connection using DatabaseUtil.getConnection().
        // 3. Create PreparedStatement.
        // 4. Set statement parameters from book.
        // 5. Execute update.
        // 6. Read generated id.
        // 7. Set generated id into book.
        // 8. Return saved book.
        return book;
    }

    public Book findById(Long id) {
        // TODO:
        // 1. Create SQL SELECT query with WHERE id = ?.
        // 2. Open Connection.
        // 3. Create PreparedStatement.
        // 4. Set id parameter.
        // 5. Execute query.
        // 6. If row exists, create Book object.
        // 7. Return Book.
        // Return null if book does not exist.
        return null;
    }

    public List<Book> findAll() {
        // TODO:
        // 1. Create SQL SELECT query.
        // 2. Open Connection.
        // 3. Create PreparedStatement.
        // 4. Execute query.
        // 5. Loop through ResultSet.
        // 6. Create Book objects and add them to list.
        // 7. Return list.
        return new ArrayList<>();
    }

    public Book update(Book book) {
        // TODO:
        // 1. Create SQL UPDATE query.
        // 2. Open Connection.
        // 3. Create PreparedStatement.
        // 4. Set statement parameters from book.
        // 5. Execute update.
        // 6. Return updated book.
        return book;
    }

    public boolean deleteById(Long id) {
        // TODO:
        // 1. Create SQL DELETE query with WHERE id = ?.
        // 2. Open Connection.
        // 3. Create PreparedStatement.
        // 4. Set id parameter.
        // 5. Execute update.
        // 6. Return true if one row was deleted.
        return false;
    }
}

