package com.company;

public class Main {

    public static void main(String[] args){
        Car car = new Car("Volkswagen", "Red", new Engine(5000, 8), "9231AK4", 5, 4);
        Truck truck = new Truck(new Engine(10000, 8), "7563HF5", 10000, 6, 3);

    }
}
