package com.Bharat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    void testDeleteBook() {
        Book book = new Book("Java Basics", "John Doe",true);
        Admin admin = new Admin("Charlie", 3);

        admin.deleteBook(book);

        assertTrue(book.isAvailable());
    }
}