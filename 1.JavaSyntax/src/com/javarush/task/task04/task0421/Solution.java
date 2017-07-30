package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();

        if(a.equals(b))
            System.out.print("Имена идентичны");
        if(!a.equals(b) && a.length() == b.length())
            System.out.print("Длины имен равны");
    }
}
