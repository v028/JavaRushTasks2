package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

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
            String s = in.readLine();
            s = s.replaceAll("\\.", "!");
            out.write(s);
        }
        r.close();
        in.close();
        out.close();
    }
}
