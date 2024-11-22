package com.library.observer;

import java.util.ArrayList;
import java.util.List;

public class BookNotifier {
    private List<Observer> observers;

    public BookNotifier() {
        observers = new ArrayList<>();
    }

    // Метод для добавления наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для удаления наблюдателя
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Метод для уведомления всех наблюдателей о новой книге
    public void notifyObservers(String bookTitle) {
        for (Observer observer : observers) {
            observer.update(bookTitle);
        }
    }
}
