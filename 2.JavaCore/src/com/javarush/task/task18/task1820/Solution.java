package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import static java.lang.System.in;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        String s1 = r.readLine();
        String s2 = r.readLine();
        r.close();
        BufferedReader in = new BufferedReader(new FileReader(s1));
        BufferedWriter out = new BufferedWriter(new FileWriter(s2));

        String[] values = in.readLine().split(" ");

        String[] val = new String[values.length];
        for (int i = 0; i < val.length; i++) {
            Float x = Float.parseFloat(values[i]);
            val[i] = Math.round(x) + "";
        }
        for (int i = 0; i < val.length; i++) {
            out.write(val[i] + " ");
        }
        in.close();
        out.close();
    }
}
