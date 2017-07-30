package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        getTokens("level22.lesson13.task01", ".");
    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tok = new StringTokenizer(query, delimiter);
        ArrayList<String> arr = new ArrayList<>();

        while (tok.hasMoreTokens()) arr.add(tok.nextToken());

        String[] result = new String[arr.size()];
        for (int z = 0; z < arr.size(); z++) result[z] = arr.get(z);
        return result;
    }
}
