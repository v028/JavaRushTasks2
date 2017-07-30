package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int j = 1; j < 11; j++) {
            int row = j;
            for (int i = 1; i <= 10; i++) {
                int result = row * i;
                if (i<10)
                    System.out.print(result + " ");
                else
                    System.out.println(result + " ");

            }
        }
    }
}
