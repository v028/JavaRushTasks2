package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        String b = r.readLine();
        String c = r.readLine();

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int count = 0;

        if (x>0)
            count++;
        if (y>0)
            count++;
        if (z>0)
            count++;

        System.out.println(count);
    }
}
