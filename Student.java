package com.Bharat;

public class Student extends User{


    public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void borrowBook(Book book) {
        if(book.isAvailable()){
            book.setAvailable(false);
            System.out.println(getName()+" Borrowed the Book : "+book.getTitle());
        }else {
            System.out.println("Sorry ! Book is already Borrowed :: ");
        }

    }

    @Override
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(getName()+" Returned the Book : "+book.getTitle());

    }
}
