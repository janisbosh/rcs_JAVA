package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1 =4;
        int number2 =7;
        int maxNumber = maxNumber(number1, number2);
        System.out.println("Lielakais skaitlis:" + maxNumber);
    }

    public static int maxNumber (int a, int b) {
        if (a > b){
        return a;
    }else {
        return b;
        }
}


    public static String combineStrings(String param){
        //Uztaisīt metodi, kura paņem vienu string tipa vertību kā parametru
        //Šo vērtību saglabāt citā stringā 10x
        //šo vērtību padot ar return
        //piemērs-> parametrs= "a" -> ar return aaaaaaaaaa

        String result = "";
        for(int i = 0; i < 10; i++){
            result = result + param;
        }

        return result;
    }

    public static void sample1(){
        int a = sum();
        System.out.println(a);
    }

    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();

        return sk1 + sk2;
    }

    public static void task1(String symbols, int count){

        String sum = "";
        for(int i = 0; i < count; i++){
            sum = sum + " " +symbols;
            System.out.println(sum);
        }

    }
}
