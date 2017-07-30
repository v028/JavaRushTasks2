package com.javarush.task.task21.task2113;

/**
 * Created by Vitaly Yakovlev on 16.07.2017.
 */
public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    //Геттеры
    public String getName() {
        return name;
    }
    public double getSpeed() {
        return speed;
    }
    public double getDistance() {
        return distance;
    }
    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    //Движение и отрисовка
    public void move() {
        distance+=speed*Math.random();
    }
    public void print() {
        int points = (int)distance;
        for (int i = 0; i < points; i++) System.out.print(".");
        System.out.println(name);
    }
}
