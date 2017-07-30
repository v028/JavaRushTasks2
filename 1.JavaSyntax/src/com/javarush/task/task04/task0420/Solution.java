package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if (x>y && x>z) {
            if (y>z) {
                System.out.println(x + " " + y + " " + z);
            } else {
                System.out.println(x + " " + z + " " + y);
            }
        }

        if (y>x && y>z) {
            if (x>z) {
                System.out.println(y + " " + x + " " + z);
            } else {
                System.out.println(y + " " + z + " " + x);
            }
        }

        if (z>x && z>y) {
            if (x>y) {
                System.out.println(z + " " + x + " " + y);
            } else {
                System.out.println(z + " " + y + " " + x);
            }
        }
    }
}
