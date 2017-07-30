package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double course = 0.89;
        System.out.println(convertEurToUsd(10, course));
        System.out.println(convertEurToUsd(20,course));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = (double) eur * course;
        return usd;
    }
}
