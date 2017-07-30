package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        String b = r.readLine();
        String c = r.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int plusCount = 0;
        int minusCount = 0;

        if (x>0)
            plusCount++;
        if (y>0)
            plusCount++;
        if (z>0)
            plusCount++;
        if (x<0)
            minusCount++;
        if (y<0)
            minusCount++;
        if (z<0)
            minusCount++;

        System.out.println("количество положительных чисел: " + plusCount);
        System.out.println("количество отрицательных чисел: " + minusCount);
    }
}
