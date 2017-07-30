package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {
    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = 0;

        for (int i = 0; i<s.length(); i++) {
            char xs = s.charAt(i);
            x = (int) xs;
                if (x % 2 == 0)
                    even++;
                else
                    odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
