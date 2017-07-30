package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream in = new FileInputStream(fileName);

        int count = 0;
        while (in.available() > 0) {
            char s = (char)in.read();
            String s2 = String.valueOf(s);
            if (s2.matches("[a-zA-Z]"))
                count++;
        }
        in.close();
        System.out.println(count);
    }
}
