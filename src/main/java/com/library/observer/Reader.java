package com.library.observer;

public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookTitle) {
        System.out.println(name + " получил уведомление о новой книге: " + bookTitle);
    }
}
