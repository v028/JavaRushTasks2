package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(r.readLine());

        int min = 999999999;
        while (in.available() > 0) {
            int x = in.read();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
        in.close();
    }
}
