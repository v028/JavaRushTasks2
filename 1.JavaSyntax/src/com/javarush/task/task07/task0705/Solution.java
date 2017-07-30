package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] large = new int[20];
        int[] min1 = new int[10];
        int[] min2 = new int[10];

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<large.length; i++)
            large[i] = Integer.parseInt(r.readLine());
        for(int i=0; i<min1.length; i++)
            min1[i] = large[i];
        for(int i=0; i<min2.length; i++)
            min2[i] = large[i + min1.length];
        for(int i=0; i<min2.length; i++)
            System.out.println(min2[i]);
    }
}
