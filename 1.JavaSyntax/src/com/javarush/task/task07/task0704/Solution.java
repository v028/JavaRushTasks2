package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] xArr = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<xArr.length; i++) {
            int j = xArr.length - 1 - i;
            xArr[j] = Integer.parseInt(r.readLine());
        }

        for (int i=0; i<xArr.length; i++) {
            System.out.println(xArr[i]);
        }
    }
}

