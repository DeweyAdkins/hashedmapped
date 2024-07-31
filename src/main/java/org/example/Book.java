package org.example;

public class Book {
    private String name;
    private String author;
    private int year;

    // Constructor
    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // toString method
    @Override
    public String toString() {
        return name + " written by " + author + " in " + year;
    }
}

