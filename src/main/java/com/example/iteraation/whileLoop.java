package com.example.iteraation;

public class whileLoop {
    public static void main(String[] args) {

        int i = 1;

        /*
        Syntax -->
        while(expression) {
            do something
        }
         */

        while (i <= 10) { // boolean --> true false
            System.out.println(i);
            i++;
        }

        int j = 0;

//        while(++j <= 10){
//            System.out.println(j);
//        }

        while (j++ < 10) {
            System.out.println(j);
        }

        int k = 1;
        //do{
        // do something
        // } while(expression);

        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        // Menu itoms selection --> do-while

       /*
       play game
       return saved  game
       exit
        */
    }
}
