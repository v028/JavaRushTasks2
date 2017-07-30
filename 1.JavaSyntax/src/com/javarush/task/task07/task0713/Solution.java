package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> all = new ArrayList<Integer>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
            all.add(Integer.parseInt(r.readLine()));

        ArrayList<Integer> x3 = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        for (int i = 0; i < all.size(); i++) {
            if (all.get(i) % 3 == 0) x3.add(all.get(i));
            if (all.get(i) % 2 == 0) x2.add(all.get(i));
            if (all.get(i) % 3 > 0 && all.get(i) % 2 > 0) other.add(all.get(i));
        }
        printList(x3);
        printList(x2);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
