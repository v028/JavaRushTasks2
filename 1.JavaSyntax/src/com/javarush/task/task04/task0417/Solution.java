package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if (x==y  && x!=z && z!=y) {
            System.out.print(x + " " + y);
        }

        if (x==z && x!=y && y!=z) {
            System.out.print(x + " " + z);
        }

        if (y==z && y!=x && z!=x) {
            System.out.print(y + " " + z);
        }

        if (x==z && x==y && y==z) {
            System.out.println(x + " " + y + " " + z);
        }
    }
}