package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] sArr = new String[10];
        int[] xArr = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<sArr.length; i++)
            sArr[i] = r.readLine();
        for(int i=0; i<sArr.length; i++)
            xArr[i] = sArr[i].length();
        for(int i=0; i<xArr.length; i++)
            System.out.println(xArr[i]);
    }
}
