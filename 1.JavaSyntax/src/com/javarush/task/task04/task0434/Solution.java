package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int row = 1;
        int col = 1;

        while (row <= 10) {
            while (col <= 10) {
                if (col < 10)
                    System.out.print(col*row + " ");
                else
                    System.out.println(col*row + " ");

                col++;
            }
            row++;
            col = 1;
        }

    }
}
