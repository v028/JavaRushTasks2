package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String one = reader.readLine();
        Cat cat1 = new Cat(one);
        String two = reader.readLine();
        Cat cat2 = new Cat(two);
        String three = reader.readLine();
        Cat cat3 = new Cat(three, null, cat1);
        String four = reader.readLine();
        Cat cat4 = new Cat(four, cat2, null);
        String five = reader.readLine();
        Cat cat5 = new Cat(five, cat4, cat3);
        String six = reader.readLine();
        Cat cat6 = new Cat(six, cat4, cat3);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        System.out.println(cat6);
    }

    public static class Cat {
        private String name;
        private Cat mom, dad;
        private String u;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mom) {
            this.name = name;
            this.mom = mom;
        }

        Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
        }

        @Override
        public String toString() {
            if (mom == null && dad == null)
                u = "Cat name is " + name + ", no mother, no father";
            else if (mom == null && dad!=null)
                u = "Cat name is " + name + ", no mother, father is " + dad.name;
            else if (dad == null && mom!=null)
                u = "Cat name is " + name + ", mother is " + mom.name + ", no father";
            else
                u = "Cat name is " + name + ", mother is " + mom.name + ", father is " + dad.name;
            return u;
        }
    }

}
