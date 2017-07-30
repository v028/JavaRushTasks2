package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();

        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);

        for (int j = 1; j<=m; j++) {
            for (int i = 1; i <= n; i++) {
                if (i < n)
                    System.out.print(8);
                else
                    System.out.println(8);
            }
        }


    }
}
