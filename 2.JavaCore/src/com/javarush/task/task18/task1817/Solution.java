package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream in = new FileInputStream(fileName);

        int spacesCount = 0, allBytes = 0;
        while (in.available() > 0) {
            char x = (char)in.read();
            allBytes = allBytes + 1;
            String space = String.valueOf(x);
            if (space.equals(" ")) spacesCount = spacesCount + 1;
        }

        Double result = (double)spacesCount/allBytes*100;
        System.out.format("%.2f", result);
        in.close();
    }
}
