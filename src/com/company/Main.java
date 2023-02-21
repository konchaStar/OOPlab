package com.company;

public class Main {

    public static void main(String[] args){
        Car car = new Car("Volkswagen", "Red", new Engine(5000, 8), "9231AK4", 5, 4);
        Truck truck = new Truck(new Engine(10000, 8), "7563HF5", 10000, 6, 3);
        Bicycle bike = new Bicycle(24, 2, 1);
        MotorizedBoat boat = new MotorizedBoat(2, new Engine(2000, 4), "14JHH2", 3);
        Bus bus = new Bus(BusTypes.TRANSIT, new Engine(6000, 8), "6578JH8", 25, 6);
    }
}
