package com.example.function;

public class channingOfFuntion {
    public static void main(String[] args) {

        fun();
    }

    static void fun() {
        fun1();
        System.out.println("bye");
    }

    static void fun1() {
        fun2();
        System.out.println("hello");
    }

    static void fun2() {
        fun3();
        System.out.println("hiii");
    }

    static void fun3() {
        System.out.println("hello");
    }
}
