package com.example.iteraation;

public class forLoop {
    public static void main(String[] args) {

//        for(int i=0;i<10;i++) { // boolean --> true / false
//            System.out.println(i);
//        }
        /*
            Flow of control of for
            1. First assignment is statement is executed (variable defination)
            2. Then second conditional statement is evaluated. (True / false)
            3. If true , control flow will execute the body of the loop
            4. Once loop body is finished , control flow will go back to the for statement and third increment
             statement will be evaluated.
             5. Again condition statement is evaluated.
             6. Repeat 2 - 5.
         */
        // integer --> byte, short, int, long

//        for(int k=1;k<10;k++) {
//            System.out.println(k);
//        }

        //Nested loop
//        for(int i = 1 ; i <= 5; i++) {
//            for(int j = 1 ; j <= i ; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        // Jump statements
        // break, continue
//        boolean b = false;
//
//        for( int i = 1; i <= 10; i++){
//            System.out.println(i);
//
//            if(b == true){
//                break;
//            }
//        }

        //continue
//        for(int i=1;i<=10;i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

        //Labels
//        outer: for(int i = 1 ; i <= 10; i++) {
//        inner:    for(int j = 1 ; j <= i ; j++) {
//                System.out.print("* ");
//                if(i >= 5){
//                    continue outer; // This now jumps directly to i++ in the outer loop
//                }
//            }
//            System.out.println();
//        }

        // Code block
//        first: {
//            second: {
//                third: {
//                System.out.println("first");
//                break second;
//                }
//            }
//        }

    }
}
