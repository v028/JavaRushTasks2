package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int max = 0, min = 1000000000;

        ArrayList<String> arr = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++)
            arr.add(r.readLine());

        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).length() > max)
                max = arr.get(i).length();
            if (arr.get(i).length() < min)
                min = arr.get(i).length();
        }

        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).length() == max) {
                System.out.println(arr.get(i));
                break;
            }
            if (arr.get(i).length() == min) {
                System.out.println(arr.get(i));
                break;
            }
        }

    }
}
