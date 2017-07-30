package com.javarush.task.task27.task2712.ad;//Created by Vitaly Yakovlev on 25.07.2017.

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {
    private final List videos = new ArrayList();

    private static AdvertisementStorage storage = new AdvertisementStorage();

    public static AdvertisementStorage getInstance() {
        return storage;
    }

    private AdvertisementStorage() {
        Object someContent = new Object();
        new Advertisement(someContent, "First Video", 5000, 100, 3 * 60); // 3 min
        new Advertisement(someContent, "Second Video", 100, 10, 15 * 60); //15 min
        new Advertisement(someContent, "Third Video", 400, 2, 10 * 60); //10 min
    }

    public List list() {
        return videos;
    }

    public void add(Advertisement advertisement) {
        videos.add(advertisement);
    }
}
