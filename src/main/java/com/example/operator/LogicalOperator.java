package com.example.operator;

public class LogicalOperator {
    public static void main(String[] args) {

         //Logical operator
        int a = 5;
        int b = 10;
        int c = 15;

        boolean d = (a < b) && (b < c);
        boolean e = (a < b) || (b < c);
        System.out.println(d + "," + e); // true
    }
}
