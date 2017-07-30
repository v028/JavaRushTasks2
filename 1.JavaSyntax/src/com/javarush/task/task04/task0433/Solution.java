package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "S";
        int i = 1;

        while (i<=100) {
            if (i%10==0)
            System.out.println(s);
            else
                System.out.print(s);
            i++;
        }

    }
}
