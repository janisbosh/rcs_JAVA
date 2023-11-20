package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int sum = task3(-1);
        System.out.println(sum);
    }

    public static int task3(int count){
        if(count < 1){
            System.out.println("Kļūda");
            return 0;
        }

        int sum = 0;

        for(int i = 1; i <=count; i++){
            sum = sum + i;
        }

        return sum;
    }



    public static String anotherSample(){
        return "aaa" + "bbb";
    }




    public static int sampleWithRetur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadfiet skaitli");
        int a = sc.nextInt();

        System.out.println("Ievadfiet skaitli");
        int b = sc.nextInt();

        int c = a + b;

        return c;
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