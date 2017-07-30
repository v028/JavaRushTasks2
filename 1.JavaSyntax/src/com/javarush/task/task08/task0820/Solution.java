package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();

        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();

        Iterator i = cats.iterator();
        while(i.hasNext()) {
            Object cat = i.next();
            pets.add(cat);
        }

        Iterator it = dogs.iterator();
        while(it.hasNext()) {
            Object dog = it.next();
            pets.add(dog);
        }

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator it = cats.iterator();
        while(it.hasNext()) {
            Object cat = it.next();
            if (pets.contains(cat)) pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        Iterator i = pets.iterator();
        while (i.hasNext()) {
            Object pet = i.next();
            System.out.println(pet);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
