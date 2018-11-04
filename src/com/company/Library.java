package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Library {
static Scanner input = new Scanner(System.in);
    //handle try and catch
    public static int isInteger(){
    while(true){
    try{
    return input.nextInt();
    } catch (InputMismatchException e){
    input.next();
    System.out.println("Your input is not appropriate. Please try again.");
    }
    }
    }
    public static void main(String[] args)  {
    //Array liste za pohranjivanje podataka o knjigama i korisnicima
        ArrayList<CreatingAccount> accounts = new ArrayList<CreatingAccount>();
        ArrayList<CreatingBook> books = new ArrayList<CreatingBook>();

        //Skener za input
        Scanner input = new Scanner(System.in);

        System.out.println("\t Welcome to the BILD IT Library");
        int broj = -1;//inicijaliziranje sa -1 jer bi sa 0 odmah izasao iz petlje

        //petlja za kreiranje pocetnog menija sa switchom kojim se rjesava korisnikov odabir
        while(broj != 0){

            System.out.print("\n\tChoose one option to proceed: " +
                    "\n\t1.Create a new account " +
                    "\n\t2.Create a book " +
                    "\n\t3.Borrow a book " +
                    "\n\t4.Return a book " +
                    "\n\t5.Rented Book List " +
                    "\n\t0.Exit. \n");

            broj = isInteger();
            switch (broj){
                case 1:CreatingAccount.creatingAccount(accounts, input);break;
                case 2:CreatingBook.createBook(books, input);break;
                case 3:BorrowingBook.borrowBook(accounts,books,input);break;
                case 4:ReturningBook.bookReturn(accounts,books,input);break;
                case 5:BookLog.rentedBookList();break;
                case 0:Exit.exit(accounts,books);break;
                default:   System.out.println("Your input is not valid, please try again.");
            }
        }

    }
}
