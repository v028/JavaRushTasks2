package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int leftSum = 0, rightSum = 0; //суммы жителей в домах
        int[] num = new int[15];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<num.length; i++)
            num[i] = Integer.parseInt(r.readLine());

        for(int i=0; i<num.length; i++) {
            if (i==0 || i%2==0)
                leftSum =+ num[i];
            else
                rightSum =+ num[i];
        }
        if (leftSum>rightSum)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
