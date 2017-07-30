package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat a = new Cat("Барсик", 3, 6, 8);
        Cat b = new Cat("ыжик", 2, 5, 7);
        Cat z = new Cat("Мотя", 5, 9, 4);

        boolean first = a.fight(b);
        boolean second = a.fight(z);
        boolean third = b.fight(z);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
