package com.example.oops;

public class Oops1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aadarsh yadav";
        s1.age = 23;
        s1.rollNumber = 102;
        s1.collage = "state university";

        s2.name = "Nilesh yadav";
        s2.age = 24;
        s2.rollNumber = 103;
        s2.collage = "state university";

        s1.markAttendance();
        s1.print();

        s2.markAttendance();
        s2.print();
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String collage;

    void markAttendance() {
        System.out.println("Mark attendance " + name);
    }

    void print() {
        System.out.println(name + "," + age + "," + rollNumber + ",");
    }
}