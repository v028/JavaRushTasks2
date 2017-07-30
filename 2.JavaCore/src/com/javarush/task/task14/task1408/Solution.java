package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen);
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if(country.contains("Belarus")) {hen = new BelarusianHen(); return hen;}
            if(country.contains("Ukraine")) {hen = new UkrainianHen(); return hen;}
            if(country.contains("Moldova")) {hen = new MoldovanHen(); return hen;}
            hen = new RussianHen();  return hen;
        }
    }


}
