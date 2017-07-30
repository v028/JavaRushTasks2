package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = r.readLine();

            if ("exit".equals(s)) break;
            else if (isDouble(s) && s.contains(".")) {
                Double value = Double.parseDouble(s);
                print(value);
            }
            else if (isInteger(s)) {
                Integer x = Integer.parseInt(s);
                if(x > 0 && x < 128) {
                    short value = Short.parseShort(s);
                    print(value);
                } else {
                    Integer value = x;
                    print(value);
                }
            } else print(s);
        }
    }

    public static boolean isDouble(String s) {try {Double.valueOf(s);return true;} catch (Exception e) {return false;}}
    public static boolean isInteger(String s) {try {Integer.valueOf(s);return true;} catch (Exception e) {return false;}}

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
