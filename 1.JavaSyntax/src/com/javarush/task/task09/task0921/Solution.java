package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> nums = null;
        try {
            nums = new ArrayList<>();
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                int x = Integer.parseInt(r.readLine());
                nums.add(x);
            }
        } catch (Exception e) {
            for (int i = 0; i < nums.size(); i++) {
                System.out.println(nums.get(i));
            }
        }
    }
}
