package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, color, address;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        this.color = name;
        this.age = name.length();
        this.weight = name.length();
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.color = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.color = name;
        this.age = age;
        this.weight = name.length();
    }
    public Cat(int weight, String color) {
        this.color = color;
        this.age = weight;
        this.weight = weight;
    }
    public Cat(int weight, String color, String address) {
        this.color = color;
        this.age = weight;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
