package com.Bharat;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookAvailabilty(){
        Book book =new Book("Java Basics", "John Doe",true);

        assertTrue(book.isAvailable(), "Book should be available when created");


    }
    @Test
    public void testSetterAndGetter(){
        Book book =new Book("Java Basics", "John Doe",true);
        book.setAvailable(false);
        assertFalse(book.isAvailable(),"Book Availability Should be false after update : ");

    }

}