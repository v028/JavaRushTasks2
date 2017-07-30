package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        String s2 = r.readLine();
        String s3 = r.readLine();
        FileOutputStream out = new FileOutputStream(s);
        FileInputStream in2 = new FileInputStream(s2);
        FileInputStream in3 = new FileInputStream(s3);

        while (in2.available() > 0) {
            out.write(in2.read());
        }
        while (in3.available() > 0) {
            out.write(in3.read());
        }

        in2.close();in3.close();out.close();
    }
}
