package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        System.out.println("Mani sauc Janis");
//        System.out.println(1+2);
//        System.out.printf("aaaa " + "bbbb");
//
//        String a = "aaaaaa" ;
//        System.out.println(a);
//        a="abc";
//        System.out.printf(a + "bbb");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi 1 simbolu virknes");
        String a = sc.nextLine ();

        System.out.println("Ievadi 2 simbolu virknes");
        String b = sc.nextLine ();

        System.out.println("Ievadi 3 simbolu virknes");
        String c = sc.nextLine ();

        System.out.println(c  + b + a );

    }
}