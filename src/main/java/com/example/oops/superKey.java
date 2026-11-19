package com.example.oops;

public class superKey {
    public static void main(String[] args) {

//        EngineeringStudent sce = new  EngineeringStudent();
//        sce.name="Aadarsh yadav";
//        sce.age=18;
//        sce.rollNo=102;
//        sce.collage="IIT G";

//        sce.print();

        EngineeringStudent sce1 = new EngineeringStudent("Aadarsh yadav", 23, 102, "IIT G");
        sce1.print();
    }
}

class Student0 {
    String name;
    int age;
    int rollNo;

    Student0() {
    }

    Student0(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void print() {
        System.out.println(name + " , " + age + ",  " + rollNo);
    }
}

class EngineeringStudent extends Student0 {
    String collage;

    EngineeringStudent(String name, int age, int rollNo, String collage) {
        super(name, age, rollNo);
//        this.name = name;
//        this.age = age;
//        this.rollNo = rollNo;
        this.collage = collage;
    }

    void print() {
        super.print();
        System.out.println(collage);
    }
}
