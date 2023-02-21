package com.company;

public class MotorizedBoat extends MotorizedVehicle{
    private int propellerAmount;
    public MotorizedBoat(int propeller, Engine engine, String number, int seats){
        super(number, engine, 0, seats);
        this.propellerAmount = propeller;
    }
}
