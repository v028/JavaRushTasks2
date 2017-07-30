package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Загрузчик файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //Path passwords = downloadFile("http://placehold.it/100x50/88cc00.png", Paths.get("e:\\a.txt"));
        Path passwords = downloadFile("https://yastatic.net/morda-logo/i/citylogos/yandex19-logo-ru.png",Paths.get("E:/"));
        //Path passwords = downloadFile("https://www.amigo.com/ship/secretPassword.txt", Paths.get("E:\\"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url=new URL(urlString);
        InputStream inputStream=url.openStream();

        Path tmp=Files.createTempFile("temp-",".tmp");
        Files.copy(inputStream,tmp);

        String fieName=urlString.substring(urlString.lastIndexOf("/"));
        Path destPath=Paths.get(downloadDirectory.toString(), fieName);
        Files.move(tmp,destPath);

        return destPath;
    }
}
