package com.javarush.task.task27.task2712.ad;//Created by Vitaly Yakovlev on 25.07.2017.

public class Advertisement {

    private Object content;
    private String name;
    private long initialAmount;
    private long amountPerOneDisplaying;
    private int hits, duration;

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.amountPerOneDisplaying = initialAmount / (long)hits;
        this.hits = hits;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public int getDuration() {
        return duration;
    }

    public int getHits() {
        return hits;
    }

    public void revalidate() {
        if (hits <= 0) throw new UnsupportedOperationException();

        hits--;
    }
}
