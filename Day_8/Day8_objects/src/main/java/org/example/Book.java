package org.example;

public class Book {

    public String autors;
    public String nosaukums;
    public int izdosanasgads;

    public void print() {
        System.out.println(autors + " " + nosaukums);
        System.out.println("Izdošanas gads: " + izdosanasgads);
    }
}
