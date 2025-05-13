package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Library library = new Library();
        LibraryAdmin.buyBooks(library);

        User user1 = new User("User1");
        User user2 = new User("User2");

        Book b1 = user1.issueBook(library, "CSE-2");
        Book b2 = user2.issueBook(library, "CSE-2");
        user1.returnBook(library, b1);
        Book b3 = user2.issueBook(library, "CSE-2");
    }
    /*
        Library Management System:
        Book: book name, author, Field, shouldBeReturnedIn.
        Library: Map<Book,int> count, issueBook(), returnBook(), checkIfBookAvailable(),
                showAvailableBooks(), showAvailableBooksByField()
        Student: roll no, name, List<Book>books, issueBook(), returnBook(),
                SearchByField(), getAvailableBooks().
        
        ADDITIONAL: Sending reminders for late issues, imposing fines.
     */
}