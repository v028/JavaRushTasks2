package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int str = 0;
        //Заполнение массива словами
        ArrayList<String> arr = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
            arr.add(r.readLine());
        //Массив заполнен

        //Поиск максимальной длинны строк в массиве
        for (int i=0; i<arr.size(); i++) {
            if(arr.get(i).length()>str)
                str = arr.get(i).length();
        }
        //Максимальная длинна сохранена

        //Поиск строк по равенству максимальной длинне и их вывод
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).length() == str)
                System.out.println(arr.get(i));
        }
    }
}
