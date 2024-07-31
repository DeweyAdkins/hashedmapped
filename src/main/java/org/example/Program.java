package org.example;

import java.util.HashMap;
import java.util.Map;

public class Program {


    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }


    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }


    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }


    public static void main(String[] args) {
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("first", "1st");
        stringMap.put("second", "2nd");
        stringMap.put("third", "3rd");
        stringMap.put("fourth", "4th");

        System.out.println("All keys:");
        printKeys(stringMap);

        System.out.println("\nKeys containing 'ir':");
        printKeysWhere(stringMap, "ir");

        System.out.println("\nValues of keys containing 'ir':");
        printValuesOfKeysWhere(stringMap, "ir");

        HashMap<String, Book> bookMap = new HashMap<>();
        bookMap.put("1", new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        bookMap.put("2", new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        bookMap.put("3", new Book("1984", "George Orwell", 1949));
        bookMap.put("4", new Book("To Kill a Mockingbird", "Harper Lee", 1960));

        System.out.println("\nAll books:");
        printValues(bookMap);

        System.out.println("\nBooks with 'The' in the name:");
        printValueIfNameContains(bookMap, "The");
    }
}