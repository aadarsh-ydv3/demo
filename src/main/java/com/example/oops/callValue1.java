// Call by referance --> There is no call by referance in java

package com.example.oops;

public class callValue1 {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        Random r2 = new Random(r1);

        System.out.println(r1.a + " , " + r1.b);

        addTen(r1);

        System.out.println(r1.a + " , " + r1.b);

    }

    static void addTen(Random r) {
        r.a = r.a + 10;
        r.b = r.b + 10;
    }
}

class Random {
    int a;
    int b;

    Random(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Random(Random r) {
        this.a = r.a;
        this.b = r.b;
    }
}
