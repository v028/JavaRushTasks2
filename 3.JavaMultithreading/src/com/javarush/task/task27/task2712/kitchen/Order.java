package com.javarush.task.task27.task2712.kitchen;//Created by Vitaly Yakovlev on 25.07.2017.

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public int getTotalCookingTime() {
        int totalTime = 0;
        for (Dish dish : dishes) {
            totalTime += dish.getDuration();
        }
        return totalTime;
    }

    public boolean isEmpty() {
        if (dishes.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (dishes == null || dishes.isEmpty()) {
            return "";
        } else {
            return "Your order: " + dishes + " of " + tablet + ", cooking time " + getTotalCookingTime() + "min";
        }
    }
}
