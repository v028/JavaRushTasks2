package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String name = r.readLine();
                try {
                    FileInputStream in = new FileInputStream(name);
                    in.close();
                } catch (FileNotFoundException e) {
                    System.out.println(name);
                    break;
                }
            }
    }
}
