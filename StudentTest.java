package com.Bharat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void testBorrowBook() {
        Book book = new Book("Java Basics", "John Doe",true);
        Student student = new Student("Alice", 1);

        student.borrowBook(book);
        assertFalse(book.isAvailable());
    }

    @Test
    void testReturnBook() {
        Book book = new Book("Java Basics", "John Doe",true);
        Student student = new Student("Alice", 1);

        student.borrowBook(book);
        student.returnBook(book);

        assertTrue(book.isAvailable());
    }
}