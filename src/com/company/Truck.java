package com.company;

public class Truck extends MotorizedVehicle{
    private int maxWeight;
    public Truck(Engine engine, String number, int maxWeight, int wheels, int seats){
        super(number, engine, wheels, seats);
        this.maxWeight = maxWeight;
    }
}
