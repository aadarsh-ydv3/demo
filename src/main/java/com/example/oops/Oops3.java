package com.example.oops;

public class Oops3 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Nilesh", 30, 102, "iit g");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.collage);

        Student2 s2 = new Student2();
    }
}

class Student2 {
    String name;
    int age;
    int rollNumber;
    String collage;

    // Default constructor
    Student2() {
    }

    //Parametrised constructor
    Student2(String n, int a, int rN, String c) {
        name = n;
        age = a;
        rollNumber = rN;
        collage = c;
    }


    void markAttendance() {
        System.out.println("Attendance mark by student1" + name);
    }
}