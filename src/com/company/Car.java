package com.company;

public class Car extends MotorizedVehicle {
    private String color;
    private String brand;
    public Car(String brand, String color, Engine engine, String number, int seats, int wheels){
        super(number, engine, seats, wheels);
        this.color = color;
        this.brand = brand;
    }
}
