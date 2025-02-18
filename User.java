package com.Bharat;

public abstract class User{

    private String name;
    private int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    // Abstract methods
    public abstract void borrowBook(Book book);
    public abstract void returnBook(Book book);
}
