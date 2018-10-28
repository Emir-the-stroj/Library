package com.company;
import java.util.Date;
import java.util.ArrayList;

public class BookLog {
    //arraylista knjiga iznajmljenih
    static ArrayList<String> list = new ArrayList<String>();

    //info metoda za iznajmljene knjige
    public void bookLog(int accountNumber, int bookNumber, String date ){
        String info = "User " + accountNumber + " is borrowed a book " +
                "with serial number " + bookNumber + " and date of borrowing is on "
                + date;
        list.add(info);
    }
    //void metoda za svaku rentanu knjigu array lista String objecta
    public static void rentedBookList(){
        for(String object : list)
            System.out.println(object);
    }
    //metoda za vracanje knjige sa date objectom i chekiranje for petljom
    public static boolean bookReturn(int accountNumber, int bookNumber){
        Date date = new Date();
        String check = " User " + accountNumber + " has rent a book " + bookNumber +
        " on: ";

        for(int i = 0; i <list.size(); i++){
            if(check.equals(list.get(i).substring(0 ,27))){
                list.set(i, " " + list.get(i) + "(Returned on: " + date.toString() + ")");
                return  true;
            }
        }
        return false;
    }
}
