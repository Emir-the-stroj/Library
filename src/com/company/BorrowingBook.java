package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class BorrowingBook {

    //metoda za pozajmljivanje knjiga
    public static void borrowBook(ArrayList<CreatingAccount> accounts,ArrayList<CreatingBook> books, Scanner input){
    BookLog logObject = new BookLog();
    boolean check = true;
    int bookNumber = 0;
    Date date = new Date();
    String borrowDate;
    int accNumber = 0;
    boolean hasA3Books = false;
//unosenje parametara i provjera da li user ima iznajmljenih knjiga i validnosti njegovog racuna
    while(check){
        System.out.println("Enter your account number: ");
        accNumber = input.nextInt();
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getAccountNumber() == accNumber){
                check = false;
                int rentedBooksNumber = accounts.get(i).getNumberOfBorrowedBooks();
               //if statement ukoliko ima 3 knjige posudjene i suprotno
                if(rentedBooksNumber < 3)
                    accounts.get(i).setNumberOfBorrowedBooks(rentedBooksNumber + 1);
                else{
                    System.out.println("You already rented 3 books.");
                    hasA3Books = true;
                    break;
                }
            }
        }
        if(hasA3Books){
            break;
        }
        if(check){
            System.out.println("Invalid account number.");
        }
        if(!check){
            System.out.println("Enter a book number");
            bookNumber = input.nextInt();
            int i = 0;
            while(i < books.size()){
                if(books.get(i).getBookNumber() == bookNumber && books.get(i).isBookStatus()== true){
                    System.out.println("Everything is OK. You borrow a book.");
                    books.get(i).setBookStatus(false);
                    borrowDate = date.toString();
                    logObject.bookLog(accNumber, books.get(i).getBookNumber(), borrowDate);
                    i++;
                    break;
                }
                else if(i==books.size() -1){
                    System.out.println("Book number is not found, try again");
                    bookNumber = input.nextInt();
                    i=0;
                }
                else i++;

            }
        }
    }



    }

}
