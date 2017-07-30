package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String text = r.readLine();
        ArrayList<Integer> arr = new ArrayList<>();
        FileInputStream in = new FileInputStream(text);

        while (in.available() > 0) {
            int z = in.read();
            if (arr.indexOf(z) < 0) arr.add(z);
        }
        in.close(); r.close();

        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) System.out.print(arr.get(i) + " ");
    }
}