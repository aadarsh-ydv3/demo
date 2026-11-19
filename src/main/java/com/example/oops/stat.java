package com.example.oops;

public class stat {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}
//Static --> they belong to class and not to object
//Private methods can not be overriden
//File methods can not be overriden

class A {
    static void fun() {
        System.out.println("hello");
    }

    private void fun2() {
        System.out.println("hello");
    }

    final void fun3() {
        System.out.println("hello");
    }
}

class B extends A {
    static void fun() {
        System.out.println("by");
    }
//    void  fun3(){
//        System.out.println("by");
//    }
}
