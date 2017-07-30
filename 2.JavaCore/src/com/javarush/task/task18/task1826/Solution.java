package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream incFile = new FileInputStream(args[2]);
        FileOutputStream outcFile = new FileOutputStream(args[3]);

        while (incFile.available() > 0)
        if (args[0].equals("-e")) {
            outcFile.write(incFile.read() + 1);
        } else if (args[0].equals("-d")) {
            outcFile.write(incFile.read() - 1);
        }
        incFile.close();
        outcFile.close();
    }

}
