// Call by Value

package com.example.oops;

public class callByValue {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        System.out.println(a + " , " + b);

        addTen(a, b);

        System.out.println(a + " , " + b);
    }

    static void addTen(int a, int b) {
        a = a + 10;
        b = b + 10;
    }
}
