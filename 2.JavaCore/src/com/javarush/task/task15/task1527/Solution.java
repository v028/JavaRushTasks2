package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        int x = s.indexOf("?");
        String s2 = s.substring(x+1);

        String[] arr = s2.split("&");

        // цикл вывода параметров
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf("=") > 0) {
                int secondIndex = arr[i].indexOf("=");
                String param = arr[i].substring(0, secondIndex);
                System.out.print(param + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");

        //Вывод значений объектов и строк
        for (int i = 0; i < arr.length; i++) {
            if (Pattern.compile("^(obj=)").matcher(arr[i]).find()) {
                String value = arr[i].substring(4);
                if (isDouble(value)) {
                    alert(Double.parseDouble(value));
                } else {
                    alert(value);
                }
            }
        }

    }

    public static boolean isDouble(String s) {try {Double.valueOf(s); return true;} catch (Exception e) { e.getStackTrace(); return false;}}

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
