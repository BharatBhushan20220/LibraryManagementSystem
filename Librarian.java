package com.Bharat;

public class Librarian extends User{

    public Librarian(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is unavailable.");
        }

    }

    @Override
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(getName() + " returned the book: " + book.getTitle());
    }

    public void addBook(Book book) {
        System.out.println("Librarian added the book: " + book.getTitle());
    }
}
