package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        String fileName2 = r.readLine();
        //String fileName = "B:/file1.txt";
        //String fileName2 = "B:/file2.txt";

        FileReader in = new FileReader(fileName);
        FileWriter out = new FileWriter(fileName2);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (in.ready()) {
            arr.add(in.read());
        }

        for (int i = 0; i < arr.size(); i++) {
            if (i%2!=0) {
                out.write(arr.get(i));
            }
        }

        in.close();
        out.close();
        r.close();
    }
}
