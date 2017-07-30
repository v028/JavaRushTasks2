package com.javarush.task.task27.task2712.statistic;//Created by Vitaly Yakovlev on 26.07.2017.

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();

    public static StatisticManager getInstance() {
        return ourInstance;
    }

    private StatisticManager() {
    }

    public void register(EventDataRow data) {

    }

    private class StatisticStorage{
        private Map<EventType, List<EventDataRow>> storage;

        public StatisticStorage(){
            storage = new HashMap<>();

            for (EventType e : EventType.values()){
                storage.put(e, new ArrayList<>());
            }
        }

        private void put(EventDataRow data){
            if (data != null)
                storage.get(data.getType()).add(data);
        }

        private  List<EventDataRow> get(EventType event){
            return storage.get(event);
        }
    }
}
