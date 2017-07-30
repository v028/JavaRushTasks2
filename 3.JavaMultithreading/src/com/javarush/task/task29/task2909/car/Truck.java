package com.javarush.task.task29.task2909.car;//Created by Vitaly Yakovlev on 21.07.2017.

public class Truck extends Car {
    public Truck(int numberOfPassengers) {
        super(TRUCK, numberOfPassengers);
    }

    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
