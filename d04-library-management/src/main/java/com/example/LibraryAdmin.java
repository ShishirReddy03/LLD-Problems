package com.example;

public class LibraryAdmin {
    public static void buyBooks(Library library) {
        library.addBook(new Book("CSE-1", Field.COMPUTERS, 10));
        library.addBook(new Book("CSE-1", Field.COMPUTERS, 10));
        library.addBook(new Book("CSE-1", Field.COMPUTERS, 10));
        library.addBook(new Book("CSE-2", Field.COMPUTERS, 10));
        library.addBook(new Book("ECE-1", Field.ELECTRONICS, 10));
        library.addBook(new Book("ECE-2", Field.ELECTRONICS, 10));
    }
}
