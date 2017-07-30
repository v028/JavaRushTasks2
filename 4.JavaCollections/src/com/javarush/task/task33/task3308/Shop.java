package com.javarush.task.task33.task3308;//Created by Vitaly Yakovlev on 29.07.2017.

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public Goods goods;
    public int count;
    public double profit;
    public String[] secretData;

    //В классе Shop.Goods должен быть создан список строк names.
    public static class Goods {
        public List<String> names = new ArrayList<>();
    }
}