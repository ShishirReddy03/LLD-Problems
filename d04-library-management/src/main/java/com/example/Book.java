package com.example;

import java.util.UUID;

public class Book {
    String bookId;
    String name;
    // String author, String description...
    Field field;
    int dueTime;

    public Book(String name, Field field, int dueTime) {
        bookId = UUID.randomUUID().toString();
        this.name = name;
        this.field = field;
        this.dueTime = dueTime;
    }

    public String getName() {
        return name;
    }

    public String getBookId() {
        return bookId;
    }

    public Field getField() {
        return field;
    }
    public int getDueTime() {
        return dueTime;
    }
}
