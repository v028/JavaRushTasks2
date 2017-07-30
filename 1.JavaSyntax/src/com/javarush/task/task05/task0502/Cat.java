package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int one = this.weight + this.strength - this.age;
        int two = anotherCat.weight + anotherCat.strength - anotherCat.age;
        if (one > two)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
