package com.example.function;

public class functionInJava {
    public static void main(String[] args) {
        //Function in java
        greet();

        sayHello("Aadarsh"); // Argument
        // int x = getNumber();
        System.out.println(getNumber());
        //getNumber();

        System.out.println(multiply(4, 5));


    }

    // No ip , No op
    static void greet() {
        System.out.println("Hello");
        return;
    }

    //In , No op
    static void sayHello(String name) { // number of parameter can be anything
        System.out.println("Hello " + name);
    }

    // No ip , Op
    static int getNumber() {
        return 10;
    }

    // Ip ,Op
    static int multiply(int a, int b) {
        return a * b;
    }
}
