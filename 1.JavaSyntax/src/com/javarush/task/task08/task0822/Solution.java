package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int min = 999999999;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min)
                min = array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(r.readLine());
            arr.add(x);
        }
        return arr;
    }
}
