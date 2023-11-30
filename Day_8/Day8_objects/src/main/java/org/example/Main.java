package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();

    }

    public static void task2() {
        Tasks[] students = new Tasks[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadi informaciju " + (i + 1));
            students[i] = input();
        }
        for (Tasks student : students) {
            student.print();
        }
    }
    public static Tasks input (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi vardu: ");
        String name = scanner.nextLine();

        System.out.print("Ievadi uzvardu: ");
        String lastName = scanner.nextLine();

        System.out.print("Ievadi kursu: ");
        int course = scanner.nextInt();
        scanner.nextLine();

        return new Tasks(name, lastName, course);
    }


    //public static void sample1() {
       // Tasks st = new Tasks("Jānis", "Bērziņš", 1);


    }











        //Tasks st = new Tasks ();
       //st.name = "Jānis ";
       //st.lastName = "Berzins ";
       //st.course =1;




