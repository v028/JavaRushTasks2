package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
    }
}
