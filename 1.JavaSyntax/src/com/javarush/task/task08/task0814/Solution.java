package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++)
            set.add(i);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        for (int i = 11; i < 1000000000; i++) {
            if (set.contains(i))
                set.remove(i);
            else
                continue;
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
