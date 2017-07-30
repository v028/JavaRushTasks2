package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandD1 = new Human("Витя", true, 66);
        Human grandD2 = new Human("Лёша", true, 65);
        Human grandM1 = new Human("Таня", false, 66);
        Human grandM2 = new Human("Валя", false, 63);
        Human mom = new Human("Света", false, 40, grandD2, grandM2);
        Human dad = new Human("Боря", true, 40, grandD1, grandM1);
        Human son = new Human("Виталик", true, 27, dad, mom);
        Human son2 = new Human("Родик", true, 9, dad, mom);
        Human son3 = new Human("Артем", true, 7, dad, mom);

        System.out.println(grandD1);
        System.out.println(grandD2);
        System.out.println(grandM1);
        System.out.println(grandM2);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(son);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother, father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















