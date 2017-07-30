package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        if (s.equals("helicopter")) {
            result = new Helicopter();
        }
        if (s.equals("plane")) {
            int passengers = Integer.parseInt(r.readLine());
            result = new Plane(passengers);
        }
        r.close();
    }
}
