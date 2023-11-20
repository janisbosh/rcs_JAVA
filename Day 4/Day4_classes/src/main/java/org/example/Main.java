package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

    task2(a);
}
public static void task2 (int a){
        for (int i = 0; i < a; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("$");
        }
        System.out.println();
    }
        }


    public static void sample1(String a, String b, String c) {
        System.out.println(c + b + a);

        if ((a + b + c).length() > 15) {
            System.out.println(a + c);
        } else {
            System.out.println(c + b + a);
        }
    }
}