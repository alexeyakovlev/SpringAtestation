package com.library;

import com.library.model.Book;
import com.library.model.BookFactory;
import com.library.observer.BookNotifier;
import com.library.observer.Reader;
import com.library.singleton.Library;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр библиотеки
        Library library = Library.getInstance();

        // Создаем фабрику книг
        Book fictionBook = BookFactory.createBook("fiction", "1984");
        Book nonFictionBook = BookFactory.createBook("nonfiction", "Sapiens");

        // Создаем систему уведомлений
        BookNotifier notifier = new BookNotifier();

        // Создаем читателей и подписываем их на уведомления
        Reader reader1 = new Reader("Алексей");
        Reader reader2 = new Reader("Мария");
        notifier.addObserver(reader1);
        notifier.addObserver(reader2);

        // Уведомляем читателей о новых книгах
        notifier.notifyObservers(fictionBook.getDescription());
        notifier.notifyObservers(nonFictionBook.getDescription());
    }
}
