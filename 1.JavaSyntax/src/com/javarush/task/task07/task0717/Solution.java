package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(r.readLine());

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int count = list.size();
        for (int i = count - 1; i >= 0; i--) {
            String x = list.get(i);
            list.add(i, x);
        }
        return list;
    }
}
