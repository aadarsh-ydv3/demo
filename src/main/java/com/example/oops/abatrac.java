package com.example.oops;

public class abatrac {
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.start();
        car.accelerating();
        car.brake();
    }
}

abstract class Car {
    void start() {
        System.out.println("Car started");

    }

    abstract void accelerating();

    abstract void brake();
}

class FuelCar extends Car {

    @Override
    void accelerating() {
        System.out.println("Fuel accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel brake");
    }
}

class ElectricCar extends Car {

    @Override
    void accelerating() {
        System.out.println("Electrical accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electrical brake");
    }
}
