package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int a = array[i];
                int b = array[j];
                if (a < b) {
                    array[i] = b;
                    array[j] = a;
                }
            }
        }

        /*int max = 0;
        ArrayList<Integer> maxs = new ArrayList<>();

        for (int i = 0; i < array.length; i++)
            maxs.add(array[i]);

        for (int i = 0; i < maxs.size(); i++) {
            int x = maxs.get(i);
            if (x > max) {
                max = x;
                maxs.remove(i);
                maxs.add(0, x);
            }
            else
                continue;
        }

        for (int i = 0; i < maxs.size(); i++) {
            array[i] = maxs.get(i);
        }*/
    }
}
