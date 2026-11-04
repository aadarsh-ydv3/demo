package com.example.demo;

public class BitwiseOperator {

    static void main(String[] args) {
        //Bitwise Operators
        int a = 2; //01 --> 00000000 00000000 00000000 00000010
        int b = 3; //11 --> 00000000 00000000 00000000 00000011
        int c = a & b; // 10 --> 2
        int d = a / b; // 11 --> 3
        int e = a ^ b; // 01 --> 1
        int f = ~a; //11111111 11111111 11111111 1111111101 --> -3

        System.out.println(c + " " + d + " " + e + " " + f);

        // Shift operation
        int g = 1; // 00000000 00000000 00000000 00000001 -->1
        g = g << 32; //--> g = g << 32 == g << 1

        byte j = 1; // 00000001
        j = (byte)(j << 1); //00000010 -->2

        System.out.println(j);
        System.out.println(g);

        // right shift (>>)(>>>)
        int h = 1;
        h = h >> 32;
        System.out.println(h);

        int i = 1;
        i = i >>> 32;
        System.out.println(i);

    }
}
