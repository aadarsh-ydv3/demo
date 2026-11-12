package com.example.function;

public class functionInJava1 {
    public static void main(String[] args) {
        //Function  Overlading
        int x = sum(10, 20);
        System.out.println(x);

        int y = sum(120, 20, 52);
        System.out.println(y);

        int z = sum(25, 23);
        System.out.println(z);

        greet("Aadarsh", 23);

        greet(23, "Aadarsh");

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) { // Diffrent number of parameter
        return a + b + c;
    }

    static int sum(double a, double b) { // Dffrent type off parameter
        return (int) (a + b);
    }

    static void greet(String name, int age) {
        System.out.println("hii " + name + ". is your age is  " + age);
    }

    static void greet(int age, String name) {  // Odering of parameter
        System.out.println("hii " + name + ". is your age is  " + age);
    }
}
