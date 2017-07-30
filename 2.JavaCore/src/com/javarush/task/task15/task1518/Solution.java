package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;
    static String name;

    static {
        cat = new Cat();
        name = cat.name;
        System.out.println(name);
    }

    static class Cat {
        public String name = "Мурзик";
    }

    public static void main(String[] args) {

    }
}
