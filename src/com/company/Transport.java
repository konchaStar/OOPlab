package com.company;
public abstract class Transport {
    protected int wheelsAmount;
    protected int numberOfSeats;
    protected String color;
    protected String brand;
    public Transport(int wheelsAmount, int numberOfSeats, String color, String brand){
        this.numberOfSeats = numberOfSeats;
        this.wheelsAmount = wheelsAmount;
        this.color = color;
        this.brand = brand;
    }
}

