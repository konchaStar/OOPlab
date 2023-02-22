package com.company;

public class MotorizedBoat extends MotorizedVehicle{
    private int propellerAmount;
    public MotorizedBoat(String brand, String color, int propeller, Engine engine, String number, int seats){
        super(brand, number, engine, color, seats, 0);
        this.propellerAmount = propeller;
    }
}
