package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(r.readLine());


        ArrayList<Integer> map = new ArrayList<>();
        ArrayList<Integer> mapResult = new ArrayList<>();
        while (in.available() > 0) {
            int z = in.read();
            map.add(z);
        }
        in.close();
        r.close();

        int maxcount = 0, icount = 0;
        for (int i = 0; i < map.size()-1; i++) {
            for (int j = 1 + i; j < map.size(); j++) {
                if (map.get(i) == map.get(j)) icount++;
            }
            if (icount >= maxcount) {
                maxcount = icount;
                mapResult.add(map.get(i));
            }
            icount = 0;
        }
        //Вывод
        if (maxcount == 0) {
            for (int i = 0; i < map.size(); i++) {
                if (i != map.size() - 1) System.out.print(map.get(i) + " ");
                else System.out.print(map.get(i));
            }
        } else {
            for (int i = 0; i < mapResult.size(); i++) {
                if (i != mapResult.size() - 1) System.out.print(mapResult.get(i) + " ");
                else System.out.print(mapResult.get(i));
            }
        }
    }
}