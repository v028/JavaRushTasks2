package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        int x = Integer.parseInt(s);
        return x;

    }

    public static double readDouble() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        double x = Double.parseDouble(s);
        return x;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        boolean x = Boolean.parseBoolean(s);
        return x;

    }

    public static void main(String[] args) {

    }
}
