package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try {
            divisionByZero();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero() throws Exception {
        System.out.println(4/0);
    }
}
