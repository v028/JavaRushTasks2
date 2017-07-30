package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min = 1000000000;

        ArrayList<String> arr = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
            arr.add(r.readLine());

        for (int i=0; i<arr.size(); i++) {
            if(arr.get(i).length()<min)
                min = arr.get(i).length();
        }


        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).length() == min)
                System.out.println(arr.get(i));
        }
    }
}
