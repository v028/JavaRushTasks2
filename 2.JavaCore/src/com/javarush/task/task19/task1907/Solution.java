package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String file = r.readLine();
        FileReader in = new FileReader(file);
        BufferedReader readIn = new BufferedReader(in);

        int count = 0;
        while (in.ready()) {
            String[] worlds = readIn.readLine().split("\\W");
            for (String s : worlds) {
                if (s.contains("world")) count++;
            }
        }

        System.out.println(count);
        r.close();
        in.close();
        readIn.close();
    }
}
