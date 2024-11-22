package com.library.model;

public class BookFactory {
    public static Book createBook(String type, String title) {
        switch (type.toLowerCase()) {
            case "fiction":
                return new FictionBook(title);
            case "nonfiction":
                return new NonFictionBook(title);
            default:
                throw new IllegalArgumentException("Unknown book type");
        }
    }
}
