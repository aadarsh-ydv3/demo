package com.operator;

public class Demo2 {
    public static void main(String[] args) {

            //1  Implicit conversion
            // (byte to int)

//        byte b=10;
//        int i;
//
//        i = b;
//        System.out.println(i); //10

        // (Character to int)

//        char c='c';
//        int j;
//        j = c;
//        System.out.println(j); // 99

        //2. Explicit conversion

//        int  i = 300;
//        byte b;
//        b = (byte)i;
//        System.out.println(b); // 300 % 256 = 44

        // 3. Truncating conversion

//        float f= 15.125f;
//        int i;
//
//        i = (int)f;
//        System.out.println(i); //15

        // Boolean to any data type
        // These conversion are not possible

//        boolean b = false;
//        int i;
//        i=b;

        // Automatic type promotion

//        byte b=50;
//        b=(byte)(b*2);
//
//        System.out.println(b);

        byte b= 42;
        char c= 'a';
        short s= 1024;
        int i= 50000;
        float f= 5.67f;
        double d= .1234;

        double result = (f * b) + (i / c) - (d * s);

        // f * b --> float
        // i / c --> integer
        // d * s --> double

        // float + integer --> float - double --> double


        System.out.println((f * b) +" + " + (i / c) +" + " + (d * s));
        System.out.println("result = "+result);

    }
}
