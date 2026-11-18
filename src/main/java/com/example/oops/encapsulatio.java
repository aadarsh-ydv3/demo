package com.example.oops;

// Encapulation

public class encapsulatio {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposite(500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposite(int amount) {
        // amount <= balance
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    // getters / setters
    public double getBalance() {
        return balance;
    }

    class Student {
        private String name;
        private int rollNumber;
        private int age;
        private String collage;

        Student(String name, int rollNumber, int age, String collage) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.age = age;
            this.collage = collage;
        }

        // getters  / setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCollage() {
            return collage;
        }

        public void setCollage(String collage) {
            // Validation --> colllage should be real
            this.collage = collage;
        }


    }
}
