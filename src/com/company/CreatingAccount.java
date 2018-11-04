package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class CreatingAccount {
    //polja podataka

    private String userName;
    private int accountNumber;
    private int numberOfBorrowedBooks;

    public CreatingAccount()  {}



    //metoda za kreiranje accounta i provjeru validacija brojeva accounta
    public static void creatingAccount(ArrayList<CreatingAccount> accounts, Scanner input) {

        CreatingAccount account = new CreatingAccount();
        accounts.add(account);//Arraylisti dodajemo kreirani account objekat

        System.out.println("Please enter your name: ");
        String name;
        name = input.nextLine();
        int number = -1;


        while(number < 0){
            number = (int)(Math.random() * 10000);
            for(int i = 0; i < accounts.size(); i++){
                if (accounts.get(i).getAccountNumber() == number){
                    number = -1;
                }
            }
        }


        //dodjeljujemo podatke objekta na poslednju poziciju u Arraylisti
        accounts.get(accounts.size() - 1).setUserName(name);
        accounts.get(accounts.size() - 1).setAccountNumber(number);
        accounts.get(accounts.size() - 1).setNumberOfBorrowedBooks(0);
        //printamo pozdravnu poruku
        System.out.println("\tDear " + accounts.get(accounts.size() - 1).getUserName() +
                "\t\nAccount number is " + accounts.get(accounts.size() - 1).getAccountNumber() +
                "\t\nYou dont have borrowed books.");

    }




    //getteri i setteri
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }

    public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }




}