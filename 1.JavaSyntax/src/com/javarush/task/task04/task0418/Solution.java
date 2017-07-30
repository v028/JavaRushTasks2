package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        if (x<y)
            System.out.println(x);
        if (y<x)
            System.out.println(y);
        if (x==y)
            System.out.println(x);

    }
}