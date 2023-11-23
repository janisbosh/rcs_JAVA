package org.example;
import java.util.Scanner;
public class Tasks {

    public void task3 () {
        String[] stringArray = new String[5];
    Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < stringArray.length; i++) {
        System.out.print("Ievadiet vērtību " + (i + 1) + ": ");
        stringArray[i] = scanner.nextLine();
    }
        for (int i = 0; i < stringArray.length; i++) {
        System.out.println("Element " + (i + 1) + ", Garums: " + stringArray[i].length());
    }
}

    public static void  run () {
inputNumbers();
    }
   private static void  inputNumbers () {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ievadiet skaitli");
       int input = scanner.nextInt();
       int smallest=0;


       while (true){
           smallest =input;
           System.out.print("Ievadiet skaitli");

       if (input < smallest) {
           System.out.println("Hellow world");
       }else{
           break;
       }
       }
   }



    public static Double averagenUMBER(int count) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            System.out.print("Ievadiet skaitli");
            double number = scanner.nextInt();
            sum += number;

        }
                return sum/count;
            }
        }


