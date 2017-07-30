package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        FileInputStream file = new FileInputStream(s);

        try {
            byte[] buff = new byte[1000];
            while (file.available() > 1000) {
                int count = file.read(buff);
                if (count > 1000) {
                    String s2 = r.readLine();
                    FileInputStream newFile = new FileInputStream(s2);
                    file = newFile;
                } else {
                    r.close();
                    file.close();
                    throw new DownloadException();
                }
            }
        } catch (DownloadException e) {
            r.close();
            file.close();
            throw new DownloadException();
        }
    }

    public static class DownloadException extends Exception {
    }
}
