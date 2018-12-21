package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatingAccountTest {

CreatingAccount account;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
         account = new CreatingAccount();
    }


    @org.junit.jupiter.api.Test
    public void setAccountNumberTest() {
        account.setAccountNumber(5248);
        int broj = account.getAccountNumber();
        assertEquals(5248, broj);
    }



    @org.junit.jupiter.api.Test
    public void setUserNameTest() {
        account.setUserName("Ivan Drago");
        assertEquals("Ivan Drago", account.getUserName());

    }



    @org.junit.jupiter.api.Test
    public void setNumberOfBorrowedBooksTest() {
        account.setNumberOfBorrowedBooks(1);
        int rezultat = account.getNumberOfBorrowedBooks();
        assertEquals(1, rezultat);
    }
}