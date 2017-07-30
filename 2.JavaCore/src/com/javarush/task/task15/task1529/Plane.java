package com.javarush.task.task15.task1529;

/**
 * Created by Vitaly Yakovlev on 11.07.2017.
 */
public class Plane implements Flyable {
    int passengers;

    public Plane(int x) {
        this.passengers = x;
    }
    public void fly() {};
}
