package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++)
            arr.add(r.readLine());

        for (int i=0; i<13; i++) {
            String last = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            arr.add(0, last);
        }

        for (int i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));
    }
}
