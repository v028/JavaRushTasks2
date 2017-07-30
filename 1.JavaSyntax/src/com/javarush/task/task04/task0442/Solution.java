package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        Boolean stop = false;

        while (!stop) {
            String s = r.readLine();
            int x = Integer.parseInt(s);
            sum = sum + x;
            if (x==-1)
                stop = true;
        }

        System.out.println(sum);
    }
}
