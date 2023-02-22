package com.company;

public class Bicycle extends Transport{
    private float wheelsDiameter;
    public Bicycle(String brand, String color, float diameter, int wheels, int seats){
        super(wheels, seats, color, brand);
        this.wheelsDiameter = diameter;
    }
}
