package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    public int getCountOfEggsPerMonth() {
        return 25;
    }
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
