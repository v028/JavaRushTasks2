package com.javarush.task.task27.task2712;//Created by Vitaly Yakovlev on 25.07.2017.

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

public class Restaurant {

    public static void main(String[] args) {

        Cook cook1 = new Cook("Amigo");
        Waiter waiter1 = new Waiter();
        cook1.addObserver(waiter1);

        Tablet tablet = new Tablet(5);
        tablet.addObserver(cook1);
        tablet.createOrder();

    }
}
