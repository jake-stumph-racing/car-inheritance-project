package com.company;

public class Ferrari extends Car {

    private double price;
    private double topSpeed;

    public Ferrari(double speed, double currentSpeed, int gears, int wheels, String steering, double price) {
        super(speed, currentSpeed, gears, wheels, steering);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
