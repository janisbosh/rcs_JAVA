package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        homework2();
    }
    public static void  homework2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi simbolu virkni");
        String  input =  sc.nextLine();

        if(input.length() >=5 && input.length() <=10) {
            System.out.println("Ok");
        } else{
            System.out.println("Not ok");
        }
    }
    public static void  homework1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi simbolu virkni");
        String  input =  sc.nextLine();

        if(input.length() > 10) {
            System.out.println("###");
        }else if(input.length() == 10){
            System.out.println("#");
        } else{
            System.out.println("##");
            }
        }
    public static void  sample4() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadi skaitli");
            int a = sc.nextInt();
            if (a >5){
                System.out.println("###");
    }else{
        System.out.println("####");
    }
    }
         public static void  sample3() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadi1 skaitli");
            int a = sc.nextInt();

            //ievadit "ja",ja skaitlis ir pozitivs un "ne:,ja skaitlis negativs un izvadit kludas pazinojumu ja ir 0
             //>
             //<
             //>=
             //<=
             //==
             //!=
             if (a > 0) {
    System.out.println("Ja");
}else if (a < 0) {
                 System.out.println("Ne");
             }else{
                 System.out.println("Kluda");
}
            // String if
             // ir vai nav vienads

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