package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0; i<5; i++)
            arr.add("text");
        System.out.println(arr.size());
        for(int i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));
    }
}
