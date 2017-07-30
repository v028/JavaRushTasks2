package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        s.add("мама");
        s.add("мыла");
        s.add("раму");

        int lon = s.size();

        for (int i = 1; i < s.size(); i = i + 2)
            s.add(i, "именно");
        s.add("именно");

        for (int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));
    }
}
