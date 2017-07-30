package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();
        int n = Integer.parseInt(b);

        int i = 1;
        while (i<=n) {
            System.out.println(a);
            i++;
        }

    }
}
