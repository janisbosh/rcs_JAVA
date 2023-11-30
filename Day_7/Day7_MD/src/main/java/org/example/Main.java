package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        homework1();
        int number = 0;
        System.out.println("enterNumber!: " + number);
    }

    public static int  homework1() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Ievadiet skaitli!");
            try {
                number = sc.nextInt();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Nepareizi, ievadi skaitli!");
                sc.nextLine();
            }
        }

        return number;
    }
}


