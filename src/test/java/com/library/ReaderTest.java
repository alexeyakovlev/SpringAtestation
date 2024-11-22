package com.library;

import com.library.observer.Reader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReaderTest {

    @Test
    public void testReaderName() {
        Reader reader = new Reader("Алексей");
        assertEquals("Алексей", reader.getName());
    }
}
