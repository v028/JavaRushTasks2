package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> mon = new ArrayList<>();
        mon.add("January");
        mon.add("February");
        mon.add("March");
        mon.add("April");
        mon.add("May");
        mon.add("June");
        mon.add("July");
        mon.add("August");
        mon.add("September");
        mon.add("October");
        mon.add("November");
        mon.add("December");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();

        for (int i = 0; i < mon.size(); i++) {
            if (mon.get(i).contains(s)) {
                System.out.println(s + " is " + (i+1) + " month");
                break;
            }
        }
    }
}
