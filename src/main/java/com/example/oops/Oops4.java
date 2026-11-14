package com.example.oops;

public class Oops4 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
//        Student3 s2 = new Student3("Aadarsh yadav");
//        Student3 s3 = new Student3("Binita yadav" ,  17);
//        Student3 s4 = new Student3("Nilesh yadav" ,25 ,103);
//        Student3 s5 = new Student3("Nilesh yadav" ,25 ,103 , "IIT bomabe");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.collage);

    }
}

// Costructor channing
class Student3 {
    String name;
    int age;
    int rollNumber;
    String collage;

    Student3() {
//        name = "Unknown";
//        age = 0;
//        rollNumber = 0;
//        collage = "Unknown";
//        this("Unknown",0,0,"Unknown");
        this("Unknown");
        System.out.println("I am first constructor");
    }

    Student3(String name) {
//        this.name = name;
//        this(name,0,0,"Unknown");
        this("Unknown", 0);
        System.out.println("I am secound constructor");
    }

    Student3(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this(name,age,0,"Unknown");
        this("Unknown", age, 0);
        System.out.println("I am third constructor");
    }

    Student3(String name, int age, int rollNumber) {
//        this.name = name;
//        this.age = age;
//        this.rollNumber = rollNumber;
        this(name, age, rollNumber, "Unknown");
        System.out.println("I am forth constructor");
    }

    Student3(String name, int age, int rollNumber, String collage) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.collage = collage;
        System.out.println("I am fifth constructor");
    }

    void markAttendance() {
        System.out.println("Attendance mark by student1" + name);
    }
}