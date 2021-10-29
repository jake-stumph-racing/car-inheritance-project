package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100, 5);
        Car car = new Car(100, 30, 5, 4, "steering");
        Ferrari ferrari = new Ferrari(200, 50, 6, 4, "quick", 100000);

        car.setCurrentSpeed(80);
        System.out.println(car.getCurrentSpeed());

        car.accelerate(100);

        car.decelerate(70);

        car.setGears(3);
        car.changingGear(100, 4);

    }


}
