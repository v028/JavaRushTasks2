package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r.readLine();
        String s2 = r.readLine();
        FileInputStream file1 = new FileInputStream(s1);
        FileInputStream file2 = new FileInputStream(s2);
        FileOutputStream rewriteF1ToF2 = new FileOutputStream(s1);

        ArrayList<Integer> bothFiles = new ArrayList<>();

        while (file2.available() > 0) {
            bothFiles.add(file2.read());
        }
        while (file1.available() > 0) {
            bothFiles.add(file1.read());
        }
        for (int i = 0; i < bothFiles.size(); i++) {
            rewriteF1ToF2.write(bothFiles.get(i));
        }
        file1.close();
        file2.close();
        rewriteF1ToF2.close();
    }
}
