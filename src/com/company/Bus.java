package com.company;

import java.lang.reflect.Type;

enum BusTypes {
    SCHOOL, COACH, TRANSIT;
}
public class Bus extends MotorizedVehicle{
    private BusTypes type;
    public Bus(String brand, String color, BusTypes type, Engine engine, String number, int seats, int wheels){
        super(brand, number, engine, color, seats, wheels);
        this.type = type;
    }
}
