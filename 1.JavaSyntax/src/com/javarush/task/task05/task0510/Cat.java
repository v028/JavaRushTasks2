package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public void initialize(String name) {
        this.name = name;
        this.color = name;
        this.age = name.length();
        this.weight = name.length();
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.color = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.color = name;
        this.age = age;
        this.weight = 0;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.age = weight;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.color = color;
        this.age = weight;
        this.weight = weight;
        this.address = address;
    }



    public static void main(String[] args) {

    }
}
