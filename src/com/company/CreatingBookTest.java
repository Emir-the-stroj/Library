package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreatingBookTest {
CreatingBook book;
    @BeforeEach
    public void setUp() {
        book = new CreatingBook();
    }

    @Test
    public void setBookNumberTest() {
        book.setBookNumber(6382);
        int broj = book.getBookNumber();
        assertEquals(6382, broj);
    }


    @Test
    public void setBookTitle() {
        book.setBookTitle("Rocky 4");
        assertEquals("Rocky 4", book.getBookTitle());
    }

    @Test
    public void isBookStatus() {
        book.setBookStatus(false);
        boolean status = book.isBookStatus();
        assertFalse(book.isBookStatus());
    }
    
}