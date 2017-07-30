package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        String s2 = r.readLine();

        FileInputStream file = new FileInputStream(s);
        FileOutputStream revercedFile = new FileOutputStream(s2);

        ArrayList<Integer> arr = new ArrayList<>();

        while (file.available() > 0) {
            arr.add(file.read());
        }

        for (int i = arr.size() - 1; i >=0; i--) {
            revercedFile.write(arr.get(i));
        }

        file.close();
        revercedFile.close();

    }
}
