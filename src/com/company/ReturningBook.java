package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class ReturningBook {


    public static void bookReturn(ArrayList<CreatingAccount> accounts,ArrayList<CreatingBook> books, Scanner input){
        // unos broja racuna i broj knjige
        System.out.println("Enter account number: ");
        int accNumber = input.nextInt();
        System.out.println("Enter a book number you want to return: ");
        int numberBorrrowedBook = input.nextInt();

        //checkiranje unesenih parametara vracene knjige
        boolean check = BookLog.bookReturn(accNumber, numberBorrrowedBook);

        if(check){
            //for each object chekiramo odgovaraju li uneseni parametri
            for(CreatingAccount object : accounts){
                if(object.getAccountNumber() == accNumber)
                    object.setNumberOfBorrowedBooks(object.getNumberOfBorrowedBooks()-1);
                break;

            }
            for (CreatingBook object : books){
                if(object.getBookNumber() == numberBorrrowedBook)
                    object.setBookStatus(true);
                break;
            }
        } else {
            System.out.println("Input is invalid. Please try again.");
        }
    }
}
