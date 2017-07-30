package com.javarush.task.task16.task1621;

/* 
Thread.currentThread - всегда возвращает текущую нить
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        NameOfDifferentThreads tt = new NameOfDifferentThreads();
        tt.start();
        for (int i = 0; i < count; i++) {
            try {
                tt.printMsg();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class NameOfDifferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println("name=" + name);
            t.sleep(1);
            //add sleep here - добавь sleep тут
        }
    }
}
