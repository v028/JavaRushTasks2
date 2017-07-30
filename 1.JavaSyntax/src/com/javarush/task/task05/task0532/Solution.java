package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = Integer.parseInt(reader.readLine());
        while (n >= 1){
            int i = Integer.parseInt(reader.readLine());
            if (i > maximum) maximum = i;
            n--;
        }
        System.out.println(maximum);
    }
}
