package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0, count = 0, i = 0, result = 0;

        while(i!=-1) {
            i = Double.parseDouble(reader.readLine());
            if (i==-1)
                break;
            sum = sum + i;
            count++;
            result = sum/count;
        }

        System.out.println(result);
    }
}

