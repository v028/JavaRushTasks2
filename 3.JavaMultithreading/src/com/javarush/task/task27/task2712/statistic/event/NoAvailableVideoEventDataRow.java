package com.javarush.task.task27.task2712.statistic.event;//Created by Vitaly Yakovlev on 26.07.2017.

import java.util.Date;

public class NoAvailableVideoEventDataRow implements EventDataRow {
    private int totalDuration;
    private Date currentDate;

    public NoAvailableVideoEventDataRow(int totalDuration) {
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public int getTime() {
        return 0;
    }
}
