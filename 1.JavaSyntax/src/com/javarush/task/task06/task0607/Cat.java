package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    static int catCount;

    public Cat() {
        Cat.catCount = Cat.catCount + 1;
    }

    public static void main(String[] args) {

    }
}
