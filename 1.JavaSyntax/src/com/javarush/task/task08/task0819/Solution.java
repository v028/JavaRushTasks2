package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it = cats.iterator();
        while(it.hasNext()) {
            cats.remove(it.next());
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> it = cats.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static class Cat {

    }
}
