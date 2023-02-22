package com.company;

public class Truck extends MotorizedVehicle{
    private int maxWeight;
    public Truck(String brand, String color, Engine engine, String number, int maxWeight, int wheels, int seats){
        super(brand, number, engine, color, seats, wheels);
        this.maxWeight = maxWeight;
    }
}
