package com.Bharat;

public class Admin extends User{

    public Admin(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Admins should not borrow books.");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Admins do not return books.");
    }

    public void deleteBook(Book book) {
        System.out.println("Admin deleted the book: " + book.getTitle());
    }
}
