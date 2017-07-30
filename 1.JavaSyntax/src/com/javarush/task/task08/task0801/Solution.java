package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> eda = new HashSet<>();

        eda.add("арбуз");
        eda.add("банан");
        eda.add("вишня");
        eda.add("груша");
        eda.add("дыня");
        eda.add("ежевика");
        eda.add("жень-шень");
        eda.add("земляника");
        eda.add("ирис");
        eda.add("картофель");

        for (String s : eda) {
            System.out.println(s);
        }
    }
}
