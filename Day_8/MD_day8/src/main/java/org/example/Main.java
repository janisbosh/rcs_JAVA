package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        md1();
    }

    private static void md1() {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadi vardu:");
            String name = sc.nextLine();
            System.out.println("Ievadi uzvardu:");
            String lastName = sc.nextLine();
            System.out.println("Enter course:");

            int course;
            while (true) {
                try {
                    course = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nepareizi, ievadi skaitlie.");
                }
            }

            studentList.add(new Student(name, lastName, course));
        }

        System.out.println("Ievaidi skaili lai filtretu:");
        int nameLength = Integer.parseInt(sc.nextLine());

        List<Student> filteredStudents = studentLength(studentList, nameLength);

        for (Student student : filteredStudents) {
            student.print();
        }
    }

    private static List<Student> studentLength(List<Student> students, int length) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if ((student.name + " " + student.lastName).length() == length) {
                result.add(student);
            }
        }
        return result;
    }
}
