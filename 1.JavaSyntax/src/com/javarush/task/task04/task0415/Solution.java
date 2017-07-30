package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int one = Integer.parseInt(a);
        int two = Integer.parseInt(b);
        int three = Integer.parseInt(c);

        String yes = "Треугольник существует.";
        String no = "Треугольник не существует.";

        if (one >= two + three || two >= one + three || three >= one + two)
            System.out.println(no);
        else
            System.out.println(yes);
    }
}