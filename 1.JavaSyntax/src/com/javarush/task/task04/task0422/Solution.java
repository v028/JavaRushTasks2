package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String y = reader.readLine();

        int year = Integer.parseInt(y);

        if (year<18)
            System.out.println("Подрасти еще");
    }
}
