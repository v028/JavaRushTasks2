package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st;
    }
}
