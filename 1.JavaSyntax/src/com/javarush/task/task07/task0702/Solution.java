package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];

        for (int i=0; i<8; i++)
            arr[i] = r.readLine();

        for (int i = 9; i>=0; i--)
            System.out.println(arr[i]);
    }
}