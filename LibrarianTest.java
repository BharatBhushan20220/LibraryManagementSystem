package com.Bharat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianTest {

    @Test
    void TestBorrowBook() {
        Book book = new Book("Java Basics", "John Doe",true);
        Librarian librarian = new Librarian("Bob", 2);

        librarian.borrowBook(book);
        assertFalse(book.isAvailable());


    }

    @Test
    void testReturnBook() {
        Book book = new Book("Java Basics", "John Doe",true);
        Librarian librarian = new Librarian("Bob", 2);

        librarian.borrowBook(book);
        librarian.returnBook(book);

        assertTrue(book.isAvailable());

    }

    @Test
    void testAddBook() {
        Book book1 = new Book("Java Basics", "John Doe",true);
        Book book2 = new Book("Java Advance", "John Doe",true);
        Librarian librarian = new Librarian("Bob", 2);

        librarian.addBook(book2);
        librarian.borrowBook(book1);
        librarian.borrowBook(book2);
        assertFalse(book1.isAvailable());

    }
}