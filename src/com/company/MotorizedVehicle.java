package com.company;

public abstract class MotorizedVehicle extends Transport{
    protected String number;
    protected Engine engine;
    public MotorizedVehicle(String brand, String number, Engine engine, String color, int numberOfSeats, int wheelsAmount){
        super(wheelsAmount, numberOfSeats, number, brand);
        this.number = number;
        this.engine = engine;
    }
}
