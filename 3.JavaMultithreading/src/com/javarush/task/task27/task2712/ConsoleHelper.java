package com.javarush.task.task27.task2712;//Created by Vitaly Yakovlev on 25.07.2017.

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> newOrder = new ArrayList<>();
        writeMessage("Choose dish: " + Dish.allDishesToString());

        String dish = readString();

        while (!"exit".equals(dish)) {
            try {
                newOrder.add(Dish.valueOf(dish));

            } catch (IllegalArgumentException e) {
                writeMessage(dish + " отсутствует в меню...");

            }
            dish = readString();

        }

        return newOrder;
    }
}
