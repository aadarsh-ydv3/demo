package com.example.oops;

// Type of inheritance
// Simple Inheritance
// Multi - level inheritance
// Hierarchical inheritance
// Multiple inheritance (not suported in java)

public class inheri1 {
    public static void main(String[] args) {

//        CSEEngineering1 cs1=new CSEEngineering1();
//        cs1.attendCSELab();

    }
}

class Student5 {  // Parent --> A
    String name;
    int age;

    public void markAttendance() {
        System.out.println("mark attendance");
    }
}

class Engineering1 extends Student5 { // Child --> B
    void attendLab() {
        System.out.println("attend lab Engineering");
    }
}

class MedicaleStudent extends Student5 { // Child --> C
    void attendLab() {
        System.out.println("attend medicale Lab");
    }
}

//class CSEEngineering1 extends Engineering1 {
//    void  attendCSELab(){
//        System.out.println("attend CSE lab");
//    }
//}
/*
Multi-lavel
A --> B -->C
Student
|
Engineeringe
|
CSEEngineeringe

*/

/*
Hierarchy
       A
      / \
     B   C
*/
/*Multuple
      A   B
      \  /
       C

       Two parent not use
 */
