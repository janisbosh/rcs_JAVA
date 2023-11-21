package org.example;

import java.util.Scanner;
public class Samples{
int a=sum();


    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();

        return sk1 + sk2;
    }
}
