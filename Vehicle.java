package com.company;

public class Vehicle {

    private double speed;
    private double currentSpeed;


    public Vehicle(double speed, double currentSpeed) {
        this.speed = speed;
        this.currentSpeed = currentSpeed;
    }

    public void accelerate(double desiredSpeed){
        if(desiredSpeed > currentSpeed){
            currentSpeed = desiredSpeed;
            System.out.println("Vehicle speed increased to: " + desiredSpeed + " mph.");
        } else {
            System.out.println("Already exceeding "+ desiredSpeed + " mph.");
        }
    }

    public void decelerate(double desiredSpeed){
        if(desiredSpeed < currentSpeed){
            currentSpeed = desiredSpeed;
            System.out.println("Vehicle speed decreased to: " + desiredSpeed + " mph.");
        } else {
            System.out.println("Already going slower than " + desiredSpeed + " mph.");
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

}
