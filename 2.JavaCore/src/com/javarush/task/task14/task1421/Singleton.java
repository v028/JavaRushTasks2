package com.javarush.task.task14.task1421;//Created by Vitaly Yakovlev on 30.07.2017.

public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }
}
