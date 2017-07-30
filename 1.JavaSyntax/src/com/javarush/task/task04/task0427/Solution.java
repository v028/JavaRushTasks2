package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int x = Integer.parseInt(a);
        int l = a.length();

        if (x%2==0 && l==1 && x>=1 && x<=999)
            System.out.println("четное однозначное число");
        if (x%2!=0 && l==1 && x>=1 && x<=999)
            System.out.println("нечетное однозначное число");
        if (x%2==0 && l==2 && x>=1 && x<=999)
            System.out.println("четное двузначное число");
        if (x%2!=0 && l==2 && x>=1 && x<=999)
            System.out.println("нечетное двузначное число");
        if (x%2==0 && l==3 && x>=1 && x<=999)
            System.out.println("четное трехзначное число");
        if (x%2!=0 && l==3 && x>=1 && x<=999)
            System.out.println("нечетное трехзначное число");
    }
}
