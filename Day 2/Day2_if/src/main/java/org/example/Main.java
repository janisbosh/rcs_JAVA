package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample2 ();

    }
    public static void  sample2 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi1 skaitli");
        int a = sc.nextInt();

        System.out.println("Ievadi2 skaitli");
                int b = sc.nextInt();

        System.out.println(a +b);
    }
    public static void  sample1 (){
        System.out.println("Ievadi savu vardu!");
        Scanner sc = new Scanner(System.in);
        String  input =  sc.nextLine();
        System.out.println("Sveiki, " +input);
    }

}