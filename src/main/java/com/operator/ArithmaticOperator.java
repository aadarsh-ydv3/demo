package com.operator;

public class ArithmaticOperator {

    public static void main(String[] args) {
        //Operator in java
        // Arithmetic Operators
        // --> +, -, *, /, %, +=, -=, ++, --, %=, /=, *=

        int a = 5;
        int b = 10;

        int c = a + b; //15
        int d = a - b; //-5
        int e = a * b; //50
        int f = b / a; //2
        int g = b % a; //0


        System.out.println(c + " , " + d + " , " + e + " , " + f + "," + g);

        int h = a + 2;
//      h = h + 2; // Since this ok is cse
        h += 2; // h = h + 2;
        h -= 2; // h = h - 2;

        h *= 3; // h = h * 3;
        h /= 5; // h = h / 5;
        h %= 5; // h = h % 5;

        System.out.println(h);

        int i = 6;
        i++; // i = i + 1 --> i+=1;
        i--; // i = i + 1 --> i+=1;

        System.out.println(i);

        // pre increment and post increment/decrement

        int j = 7;
        j++; // postfix increment
        ++j; // prefix increment
        // j = 9;
        int k = j++; //k = j; j =j + 1;

        System.out.println(j + "," + k ); // 10 ,9

        int l = ++j; //l =j+1;

        System.out.println(j + "," + l); // 11 ,11

    }
}