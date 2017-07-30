package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> sons = new ArrayList<>();
        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();

        Human son = new Human("Виктор", 5, true, null);
        Human son2 = new Human("Вася", 9, true, null);
        Human son3 = new Human("Игорь", 5, true, null);
        sons.add(son);
        sons.add(son2);
        sons.add(son3);
        Human mom = new Human("Ира", 35, false, sons);
        Human dad = new Human("Вова", 35, true, sons);
        parents1.add(mom);
        parents2.add(dad);
        Human grandMom = new Human("Таня", 65, false, parents1);
        Human granddad = new Human("Леша", 65, true, parents1);
        Human grandMom2 = new Human("Валя", 65, false, parents2);
        Human granddad2 = new Human("Витя", 65, true, parents2);

        System.out.println(granddad);
        System.out.println(granddad2);
        System.out.println(grandMom);
        System.out.println(grandMom2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public  Human(String name, int age, boolean sex, ArrayList<Human> child) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = child;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (children!=null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }

}
