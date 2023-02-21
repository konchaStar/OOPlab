package com.company;
public abstract class Transport {
    protected int wheelsAmount;
    protected int numberOfSeats;
    public Transport(int wheelsAmount, int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
        this.wheelsAmount = wheelsAmount;
    }
}

