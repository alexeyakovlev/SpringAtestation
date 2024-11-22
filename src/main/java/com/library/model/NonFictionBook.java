package com.library.model;

public class NonFictionBook extends Book {
    public NonFictionBook(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "Non-Fiction Book: " + title;
    }
}
