package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = r.readLine();
            if (!fileName.equals("exit")) {
                new ReadThread(fileName).start();
            } else break;
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            super(fileName);
            this.fileName = fileName;
        }
        public void run() {
            try {
                int maxByte = 0, count = 1;
                FileInputStream in = new FileInputStream(fileName);
                while (in.available() > 0) {
                    int byteValue = in.read();
                    if (byteValue > maxByte) maxByte = byteValue;
                }
                resultMap.put(fileName, maxByte);
                in.close();

            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            }
        }
    }
}
