package com.library;

import com.library.observer.BookNotifier;
import com.library.observer.Reader;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BookNotifierTest {

    @Test
    public void testNotifyObservers() {
        // Подмена стандартного вывода для проверки уведомлений
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        BookNotifier notifier = new BookNotifier();
        Reader reader1 = new Reader("Алексей");
        Reader reader2 = new Reader("Мария");
        notifier.addObserver(reader1);
        notifier.addObserver(reader2);

        notifier.notifyObservers("1984");

        String expectedOutput = "Алексей получил уведомление о новой книге: 1984\n" +
                "Мария получил уведомление о новой книге: 1984\n";
        assertEquals(expectedOutput, outputStream.toString());

        // Восстанавливаем стандартный вывод
        System.setOut(System.out);
    }
}
