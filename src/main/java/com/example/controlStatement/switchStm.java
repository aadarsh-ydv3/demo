package com.example.controlStatement;

public class switchStm {
    public static void main(String[] args) {
        //Switch Statement

        int i = 3;

        switch (i) { // switch(expressoin)--> byte, short, int, char,Enumeration
            case 1:
                System.out.println("i si 1");
                break;
            case 2:
                System.out.println("i si 2");
                break;
            case 3:
                System.out.println("i si 3");
                break;
            default:
                System.out.println("i si default");
                break;
        }

        // switch --> limited use case --> should avaluat to short, byte, int ,char Enumeration
        // no dublicate cases allowed
        // After JDK-7 String can also be used as switch expression
        // After JDK-14 switch is enhance too much.

        // nestet switch
        int j = 5;
        int k = 6;
        switch (j) {
            case 4:
                System.out.println("j is 4");
                break;
            case 5:
                switch (k) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
            default:
                System.out.println("j is not 4 && 5");
                break;

        }
    }
}
