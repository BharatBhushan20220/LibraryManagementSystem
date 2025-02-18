package com.Bharat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to The Library Management System Project ::: !" );

        System.out.println();

        Book book1=new Book("Java Basics", "John Doe",true);

        // Create user instances
        Student student = new Student("Alice", 1);
        Librarian librarian = new Librarian("Bob", 2);
        Admin admin = new Admin("Charlie", 3);

        book1.displayBookInfo();
        student.borrowBook(book1);
        librarian.borrowBook(book1);
        student.returnBook(book1);
        librarian.borrowBook(book1);
        admin.borrowBook(book1);
        admin.deleteBook(book1);
    }
}
