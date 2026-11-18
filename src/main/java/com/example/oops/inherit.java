package com.example.oops;

public class inherit {
    public static void main(String[] args) {
        Engineering es = new Engineering();
        es.markAttendance();
        es.attendLab();

        Student4 s4 = new Student4();
        // s4.attendLab(); //(wrong)

    }
}

/*
 parent (superclass) --> child (subclass)
*/
class Student4 {
    String name;
    int age;

    public void markAttendance() {
        System.out.println("mark attendance");
    }
}

class Engineering extends Student4 {
    void attendLab() {
        System.out.println("attend lab");
    }
}
