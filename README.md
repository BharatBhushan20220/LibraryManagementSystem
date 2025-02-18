# LibraryManagementSystem

Key OOP Concepts Used:

Encapsulation:

1)Hide book details (like title, author, availability) in a Book class, and expose these via methods (getters and setters).

2)Use access modifiers (private, protected, public) to control visibility.

Inheritance:

1)Have a base class User, and extend it to create subclasses like Student, Librarian, and Admin.

2)These subclasses can inherit common functionalities (borrow books, return books) from the User class and have their own unique functionalities.

Polymorphism:

1)Override methods like borrowBook and returnBook in subclasses (for students, librarians, and admins).

2)Different classes can perform the same actions but in different ways (e.g., Admin can delete books, while Librarian can only add or update them).

Abstraction:

1)Abstract classes and interfaces can be used to define common methods and behaviors for different roles (e.g., User, Admin, Librarian could implement an interface for borrow and return books).

Functionality:

1)Student can borrow and return books.

2)Librarian can borrow, return, and add books.

3)Admin can borrow and return no books but can delete books.

Unit Testing:

1)JUnit: A widely used framework for writing tests in Java.

2)Mockito: A mocking framework used for creating mock objects, especially useful for testing code that interacts with external systems or dependencies.

