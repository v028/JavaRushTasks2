package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String inDate = r.readLine();
        SimpleDateFormat inDateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
        Date inDateObj = new Date(inDate);
        System.out.println(inDateFormat.format(inDateObj).toUpperCase());
    }
}
