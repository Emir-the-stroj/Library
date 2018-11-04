package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreatingBook {
    //polja podataka
    private int bookNumber;
    private String bookTitle;
    private boolean bookStatus;


    //metoda za dodavanje kreirane knjige arraylisti
    public static void createBook(ArrayList<CreatingBook> books, Scanner input){
        CreatingBook book = new CreatingBook();
        books.add(book);//arraylisti dodajemo kreirani objekat knjige

        System.out.println("Enter a book title:" );
        String title;
        title = input.nextLine();
                int number = -1;

        while(number < 0){
            number = (int)(Math.random() * 10000);
            for (int i = 0; i < books.size(); i++){
                if(books.get(i).getBookNumber() == number){
                    number = -1;
                }
            }
        }
        books.get(books.size()-1).setBookTitle(title);
        books.get(books.size()-1).setBookNumber(number);
        books.get(books.size()- 1).setBookStatus(true);

        //Ispis podataka o knjizi
        System.out.println("\tBooks name: " + books.get(books.size()-1).getBookTitle()+
                "\t\nBooks number is: " + books.get(books.size()-1).getBookNumber()+
                "\t\nStatus(book is avialable)" + books.get(books.size()-1).isBookStatus());




    }


    //getteri i setteri
    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

}
