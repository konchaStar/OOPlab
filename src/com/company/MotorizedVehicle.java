package com.company;

public abstract class MotorizedVehicle extends Transport{
    private String number;
    private Engine engine;
    public MotorizedVehicle(String number, Engine engine, int numberOfSeats, int wheelsAmount){
        super(numberOfSeats, wheelsAmount);
        this.number = number;
        this.engine = engine;
    }
}
