package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double inputTime = Double.parseDouble(s);

        String color = "красный";

        for (int i = 0; i <= 60; i = i + 5) {
            if (inputTime <= 3 + i) {
                color = "зелёный";
                break;
            }
            if (inputTime > 3 + i && inputTime <= 4 + i) {
                color = "желтый";
                break;
            }
            if (inputTime > 4 + i && inputTime <= 5 + i) {
                color = "красный";
                break;
            }
        }
        System.out.println(color);
    }
}