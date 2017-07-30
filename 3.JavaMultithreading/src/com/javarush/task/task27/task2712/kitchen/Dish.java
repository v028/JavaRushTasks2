package com.javarush.task.task27.task2712.kitchen;//Created by Vitaly Yakovlev on 25.07.2017.

public enum Dish {
    Fish(25),
    Steak(30),
    Soup(15),
    Juice(5),
    Water(3);

    private int duration;

    Dish(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString() {
        String menu = "";
        for (int i = 0; i < values().length; i++) {
            if (i != values().length - 1) {
                menu += values()[i] + ", ";
            } else {
                menu += values()[i];
            }
        }

        return menu;
    }

}
