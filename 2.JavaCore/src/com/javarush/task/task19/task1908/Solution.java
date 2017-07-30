package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String f1 = r.readLine();
        String f2 = r.readLine();
        //String f1 = "B:/file1.txt";
        //String f2 = "B:/file2.txt";
        BufferedReader in = new BufferedReader(new FileReader(f1));
        BufferedWriter out = new BufferedWriter(new FileWriter(f2));

        while (in.ready()) {
            String[] line = in.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if (Pattern.matches("^+[0-9]+$", line[i])) {
                    out.write(line[i] + " ");
                }
            }
        }
        r.close();
        in.close();
        out.close();
    }
}
