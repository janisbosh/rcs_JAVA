package org.example;

public class Tasks {
    public String name;
    public String lastName;
    public int course;
    public Tasks(String name, String lastName, int course) {
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    public void print() {
        System.out.println(name + " " + lastName + ", Course: " + course);
    }
}

   // public String name;
   // public String lastName;
    //public int course;

    //public Tasks (String name, String lastName, int course){
    //this.name =name;
   // this.lastName =lastName;
    //.course = course;

   // public void print (){
      //  System.out.println(name + " "+lastName);
     //   System.out.println("Kurss: "+course);


