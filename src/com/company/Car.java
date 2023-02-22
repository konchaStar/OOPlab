package com.company;
enum CarTypes{

}
public class Car extends MotorizedVehicle {
    private CarTypes type;
    public Car(String brand, String color, Engine engine, String number, CarTypes type, int seats, int wheels){
        super(brand, number, engine, color, seats, wheels);
        this.type = type;
    }
}
