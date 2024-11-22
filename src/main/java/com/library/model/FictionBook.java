package com.library.model;

public class FictionBook extends Book {
    public FictionBook(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "Fiction Book: " + title;
    }
}
