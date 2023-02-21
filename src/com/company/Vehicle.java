package com.company;
public abstract class Vehicle {
    protected int wheelsAmount;
    protected int numberOfSeats;
    public Vehicle(int wheelsAmount, int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
        this.wheelsAmount = wheelsAmount;
    }
}

