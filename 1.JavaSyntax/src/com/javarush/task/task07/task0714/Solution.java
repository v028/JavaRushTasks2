package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
            s.add(r.readLine());

        s.remove(2);

        for (int i = s.size() - 1; i >= 0; i--)
            System.out.println(s.get(i));
    }
}


