package com.javarush.task.task30.task3008;//Created by Vitaly Yakovlev on 22.07.2017.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //Пишем в консоль
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    //Читаем с консоли строку
    public static String readString() {
        String s = "";
        while (true) {
            try {
                s = reader.readLine();
                break;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return s;
    }

    //Обработка числа
    public static int readInt() {
        int x = 0;
        while (true) {
            try {
                x = Integer.parseInt(readString());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз");
            }
        }
        return x;
    }
}
