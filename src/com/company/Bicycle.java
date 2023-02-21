package com.company;

public class Bicycle extends Transport{
    private float wheelsDiameter;
    public Bicycle(float diameter, int wheels, int seats){
        super(wheels, seats);
        this.wheelsDiameter = diameter;
    }
}
