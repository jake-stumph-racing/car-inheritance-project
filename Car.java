package com.company;

public class Car extends Vehicle {

    private int gears;
    private int wheels = 4;
    private String steering;

    public Car(double speed, double currentSpeed, int gears, int wheels, String steering) {
        super(speed, currentSpeed);
        this.gears = gears;
        this.wheels = wheels;
        this.steering = steering;
    }

    public void changingGear(double desiredSpeed, int desiredGear) {
        int topGearSpeed = gears * 30;

//        if (gears == 1) {
//            topGearSpeed = 30;
//        } else if (gears == 2) {
//            topGearSpeed = 60;
//        } else if (gears == 3) {
//            topGearSpeed = 90;
//        } else if (gears == 4) {
//            topGearSpeed = 120;
//        } else if (gears == 5) {
//            topGearSpeed = 150;
//        }

//            switch (gears) {
//                case 1:
//                    topGearSpeed = 30;
//                case 2:
//                    topGearSpeed = 60;
//                case 3:
//                    topGearSpeed = 90;
//                case 4:
//                    topGearSpeed = 120;
//                case 5:
//                    topGearSpeed = 150;
//                default:
//                    break;
//            }

            if (desiredSpeed > getCurrentSpeed() && desiredSpeed > topGearSpeed) {
                desiredGear = gears + 1;
                System.out.println("You changed from " + gears + " gear to " + desiredGear + " gear at "
                        + getCurrentSpeed() + " and accelerated to " + desiredSpeed + " mph.");
            } else {
                System.out.println("No gear change required.");
            }

        }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getWheels() {
        return 4;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }
}
