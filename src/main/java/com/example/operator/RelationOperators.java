package com.example.operator;

public class RelationOperators {
    public static void main(String[] args) {
        // Relational operators,
        // --> ==, !=, <, >, <=, >=

        int a = 5;
        int b = 10;

        boolean c = (a == b);
        System.out.println(c); //false

        boolean d = (a != b);
        System.out.println(d); //true

        boolean e = (a > b); // false
        boolean f = (a < b); // true
        boolean g = (a <= b); // true
        boolean h = (a >= b); // false

        System.out.println(e +","+ f +","+ g+","+h);
    }
}
