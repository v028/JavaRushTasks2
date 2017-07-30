package com.javarush.task.task27.task2712.statistic.event;//Created by Vitaly Yakovlev on 26.07.2017.

import java.util.Date;

public interface EventDataRow {
    EventType getType();

    /**
     * Дата создания записи
     * @return
     */
    Date getDate();

    /**
     * время — продолжительность
     * @return
     */
    int getTime();
}
