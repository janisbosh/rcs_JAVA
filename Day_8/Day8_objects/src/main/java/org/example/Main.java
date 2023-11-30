package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book book = new Book();
        System.out.println("Ievadi gramatu");
        System.out.print("Autors: ");
        book.autors = scanner.nextLine();
        System.out.print("Nosaukums: ");
        book.nosaukums = scanner.nextLine();
        System.out.print("Izdošanas gads: ");
        book.izdosanasgads = Integer.parseInt(scanner.nextLine());
        book.print();



        //book.autors = "Janis ";
        //book.nosaukums = "Berzins ";
       // book.izdosanasgads = 2023;


        //Student st = new Student ();
       // st.name = "Jānis ";
       // st.lastName = "Berzins ";
       // st.course =1;

        //st.print();
    }
}