package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);

        int n = 365;
        if (x%400==0 || x%4==0)
        {n = 366;}
        if (x%100==0 && x%400!=0)
        {n = 365;}
        if (x%400==0 && x%100==0)
        {n = 366;}
        if (x>0 && x<4)
        {n = 365;}

        System.out.println("количество дней в году: " + n);
    }
}