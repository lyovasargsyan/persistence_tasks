package com.example.jdbc;

import com.example.jdbc.model.Book;
import com.example.jdbc.repository.BookRepository;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BookRepository repository = new BookRepository();

        Book book = new Book("Java Basics", "John Smith", "ISBN-001", new BigDecimal("19.99"));

        System.out.println("Create book:");
        Book savedBook = repository.create(book);
        System.out.println(savedBook);

        System.out.println();
        System.out.println("Find all books:");
        List<Book> books = repository.findAll();
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println();
        System.out.println("Find book by id:");
        Book foundBook = repository.findById(savedBook.getId());
        System.out.println(foundBook);

        System.out.println();
        System.out.println("Update book:");
        savedBook.setPrice(new BigDecimal("24.99"));
        Book updatedBook = repository.update(savedBook);
        System.out.println(updatedBook);

        System.out.println();
        System.out.println("Delete book:");
        boolean deleted = repository.deleteById(savedBook.getId());
        System.out.println("Deleted: " + deleted);
    }
}

