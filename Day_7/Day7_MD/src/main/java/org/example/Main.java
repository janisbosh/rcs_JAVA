package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int number = enterNumber();
        System.out.println("enterNumber!: " + number);
    }

    public static int enterNumber () {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Ievadiet skaitli!");
            try {
                number = sc.nextInt();
                isValidInput = true;
            } catch (Exception e) {
                System.out.println("Nepareizi, ievadi skaitli!");
                sc.nextLine();
            }
        }

        return number;
    }
}


