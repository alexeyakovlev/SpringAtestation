package com.library;

import com.library.model.Book;
import com.library.model.BookFactory;
import com.library.model.FictionBook;
import com.library.model.NonFictionBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookFactoryTest {

    @Test
    public void testCreateFictionBook() {
        Book book = BookFactory.createBook("fiction", "1984");
        assertEquals("Fiction Book: 1984", book.getDescription());
        assertEquals(FictionBook.class, book.getClass());
    }

    @Test
    public void testCreateNonFictionBook() {
        Book book = BookFactory.createBook("nonfiction", "Sapiens");
        assertEquals("Non-Fiction Book: Sapiens", book.getDescription());
        assertEquals(NonFictionBook.class, book.getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateUnknownBookType() {
        BookFactory.createBook("unknown", "Unknown Book");
    }
}
