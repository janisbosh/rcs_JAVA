package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {

    public static int task3() {
        try {
            int ievaditsSkaitlis = ievaditSkaitli();
            System.out.println("Ievadītais skaitlis: " + ievaditsSkaitlis);
            return ievaditsSkaitlis;
        } catch (Exception e) {
            System.out.println("Kļūda: " + e.getMessage());
            return 0;
        }
    }

    public static int ievaditSkaitli() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ievadiet skaitli: ");
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Nederīga ievade. Ievadītā vērtība nav skaitlis.");
            return 0;
        } finally {
            scanner.close();
        }
    }
}







   // private static task3 {


        //public List<String> stringList;


        public void addValues ( int count){
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < count; i++) {
                System.out.print("Ievadiet vērtību: ");
                stringList.add(scanner.nextLine());
            }
        }
        public void printList () {
            System.out.println("Saraksts:");
            for (String value : stringList) {
                System.out.println(value);
            }
        }
        public void printValue () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ievadiet indeksu: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < stringList.size()) {
                System.out.println("Izvēlētā vērtība: " + stringList.get(index));
            }
        }
    }






    public static double task1 (double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
               max = array[i];
        }
        return max;
    }
}
