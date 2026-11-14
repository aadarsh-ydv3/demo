package com.example.oops;

public class Oops2 {
    public static void main(String[] args) {

        Student1 s1 = new Student1();

        s1.name = "Aadarsh";
        s1.age = 10;
        s1.rollNumber = 102;
        s1.collage = "Guahati";
        // Constractre-->  To create an Object.

        // Default values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.collage);

//        int x;  // Local variable --> no default value
//        System.out.println(x);

    }
}

/*
    integer --> 0
    float  --> 0.0
    String  --> Null
    boolean --> false (Nothing)
*/
class Student1 {
    String name; // infomation / charactristic / data  --> isntance varaiable
    int age;
    int rollNumber;
    String collage;

    void markAttendance() { // behaviours --> instance methods
        System.out.println("Attendance mark by student1" + name);
    }
}