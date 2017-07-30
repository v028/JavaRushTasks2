package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream print = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream newPrint = new PrintStream(arr);
        System.setOut(newPrint);

        testString.printSomething();

        String result = arr.toString();

        System.setOut(print);

        result = result.replaceAll("te", "??");

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
