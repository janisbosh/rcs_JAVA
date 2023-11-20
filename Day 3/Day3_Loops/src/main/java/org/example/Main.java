package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        md1();
    }

    public static void md1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("$");
            }
                System.out.println();
        }
    }

        public static void task4() {
        Scanner sc = new Scanner(System.in);
        String name ="ziema";
        String input = "";

        while (!input.equals(name)) {
            System.out.println("ievadi vardu");
            input = sc.nextLine();

            if (!input.equals(name)) {
                System.out.println("Megini vel");

            }
        }
        System.out.println("Uzmineji");
}

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadi skaitli");
            int number = sc.nextInt();

            if (number > 0) {
                sum = sum + number;
            } else {
                System.out.println("kluda");
            }
            System.out.println("kopejais garums ir " + sum);
        }
    }


    public static void task2() {
        Scanner sc = new Scanner(System.in);

        int len = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadi vertibu");
            String input = sc.nextLine();
            len = len + input.length();
        }
        System.out.println("kopejais garums ir " + len);
    }

    public static void sample2() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ievadi skaitli");
            int number = sc.nextInt();
            sum = sum + number;
            System.out.println(number);
            System.out.println("--------------");
        }
        System.out.println("Summa ir " + sum);
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Ievadi skaitli");
            int number =sc.nextInt();
            System.out.println(number +5);
        }
    }

    public static void example1() {

        for (int i = 0; i < 5; i++) {//sakam skaitit ar 0, cikls darbojas kamer i ir mazaks par 5, i=i+1
            System.out.println(i);
            System.out.println("Hello");
            System.out.println("--------------");
        }
    }
}