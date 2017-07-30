package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat a = new Cat("Барсик", 2, 4, 5);
        Cat b = new Cat("Путя", 3, 5, 7);
        Cat c = new Cat("Вася", 4, 6, 3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}