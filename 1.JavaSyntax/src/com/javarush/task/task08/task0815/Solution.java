package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> names = new HashMap<String, String>();
        names.put("Яковлев", "Виталий");
        names.put("Выборнов", "Сергей");
        names.put("Еременко", "Владислав");
        names.put("Кензо", "Иван");
        names.put("Завеуха", "Игорь");
        names.put("Ресенчук", "Артем");
        names.put("Куликов", "Сергей");
        names.put("Романов", "Владислав");
        names.put("Горький", "Михаил");
        names.put("Грошев", "Борис");

        return names;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            HashMap.Entry<String, String> pair = iterator.next();
            if (pair.getValue() == name)
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            HashMap.Entry<String, String> pair = iterator.next();
            if (pair.getKey() == lastName)
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
