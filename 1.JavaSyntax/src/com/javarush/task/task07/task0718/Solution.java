package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            arr.add(r.readLine());

        for (int i = 0 ; i < arr.size()-1; i++) {
            if (arr.get(i).length() > arr.get(i+1).length()) {
                System.out.println(i+1);
                break;
            }
        }
    }
}

