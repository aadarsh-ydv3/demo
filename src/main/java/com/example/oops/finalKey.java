package com.example.oops;

public class finalKey {
    public static void main(String[] args) {
        Random1 r1 = new Random1();
        System.out.println(r1.PI);

        final int x;
        x = 5;
        System.out.println(x);
    }
}

class Random1 {
    static final double PI;

    static {
        PI = 3.14;
    }

//    Random1(){
//        this.PI = 3.14;
//    }
}
