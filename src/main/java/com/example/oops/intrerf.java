package com.example.oops;

interface Car1 {
    void start();

    void acelerate();

    void brake();
}

public class intrerf {
    public static void main(String[] args) {
        Car1 car = new ElectricCar1();
        car.start();
        car.acelerate();
        car.brake();
    }
}

class FuelCar1 implements Car1 {
    @Override
    public void start() {
        System.out.println("Fuel start");
    }

    @Override
    public void acelerate() {
        System.out.println("Fuel accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fuel brake");
    }
}

class ElectricCar1 implements Car1 {
    @Override
    public void start() {
        System.out.println("ElectricCar1 start");
    }

    @Override
    public void acelerate() {
        System.out.println("Electrical accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electrical brake");
    }
}