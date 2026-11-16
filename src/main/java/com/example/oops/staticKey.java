package com.example.oops;

public class staticKey {
    public static void main(String[] args) {

        Student6 s61 = new Student6("Aadarsh", 23, 102);
        Student6 s62 = new Student6("Nilesh", 24, 103);

//        Student6.collage = "State univercity";

        System.out.println(s61.name + ",  " + s61.age + " , " + s61.rollNo + " , " + Student6.collage);
        System.out.println(s62.name + ",  " + s62.age + " , " + s62.rollNo + " , " + Student6.collage);

    }
}

class Student6 {
    static String collage = "State University";

    // Static block;
    static {
//        collage = "State university";
    }

    String name;
    int age;
    int rollNo;

    Student6(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

}
