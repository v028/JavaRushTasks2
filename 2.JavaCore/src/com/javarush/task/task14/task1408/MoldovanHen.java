package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {
    public int getCountOfEggsPerMonth() {
        return 18;
    }
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
