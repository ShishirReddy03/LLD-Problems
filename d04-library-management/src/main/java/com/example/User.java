package com.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<Book> books;

    public User(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public Book issueBook(Library library, String bookName) {
        for (var entry : library.getBooks().entrySet()) {
            if (entry.getKey().getName().equals(bookName)) {
                if (!library.isBookAvailable(entry.getKey())) {
                    System.out.println(bookName + " is not available");
                    return null;
                }
                library.removeBook(entry.getKey());
                books.add(entry.getKey());
                System.out.println(name + " is taking " + bookName);
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("Book Name Invalid");
    }

    public void returnBook(Library library, Book book) {
        library.addBook(book);
        books.remove(book);
        System.out.println(name + " is returning " + book.getName());
    }

    public List<Book> getIssuedBooks() {
        return books;
    }
}
