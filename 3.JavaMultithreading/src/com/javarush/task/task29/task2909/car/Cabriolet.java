package com.javarush.task.task29.task2909.car;//Created by Vitaly Yakovlev on 21.07.2017.

public class Cabriolet extends Car {
    public Cabriolet(int numberOfPassengers) {
        super(CABRIOLET, numberOfPassengers);
    }

    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
