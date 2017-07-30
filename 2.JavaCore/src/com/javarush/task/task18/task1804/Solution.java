package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String text = r.readLine();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        FileInputStream in = new FileInputStream(text);

        while (in.available() > 0) {
            int z = in.read();
            if (countMap.containsKey(z)) {
                int repeats = countMap.get(z) + 1;
                countMap.put(z, repeats);
            } else countMap.put(z, 1);
        }
        in.close();
        r.close();

        int min = 1;
        for (Integer key : countMap.keySet()) {
            /*if (countMap.get(key) > min && min == 1) {
                min = countMap.get(key);
            }*/
            if (countMap.get(key) < min) min = countMap.get(key);
        }
        //Вывод
        //String s = "";
        for (Integer key : countMap.keySet()) {
            if (countMap.get(key) == min) System.out.print(key + " ");
        }
        //System.out.println(s.trim());
    }
}
