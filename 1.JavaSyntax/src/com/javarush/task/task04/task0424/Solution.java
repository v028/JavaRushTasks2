package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        if (x==y && z!=x && z!=y)
            System.out.println(3);
        if (x==z && y!=x && y!=z)
            System.out.println(2);
        if (y==z && x!=y && x!=z)
            System.out.println(1);
    }
}
