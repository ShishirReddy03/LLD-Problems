package com.example;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<Book, Integer> books;

    public Library() {
        books = new HashMap<>();
    }

    public Map<Book, Integer> getBooks() {
        return books;
    }

    public Map<Book, Integer> getBooksByField(Field field) {
        Map<Book, Integer> booksByField = new HashMap<>();
        for (var entry : books.entrySet()) {
            if (entry.getKey().getField() == field) {
                booksByField.put(entry.getKey(), entry.getValue());
            }
        }
        return booksByField;
    }

    public boolean isBookAvailable(Book book) {
        return books.getOrDefault(book, 0) >= 1;
    }

    public void addBook(Book book) {
        books.put(book, books.getOrDefault(book, 0) + 1);
    }

    public void removeBook(Book book) {
        if (!isBookAvailable(book)) {
            System.out.println(book.getName() + " is not available");
            return;
        }
        books.put(book, books.get(book) - 1);
    }

}
