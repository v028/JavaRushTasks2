package com.javarush.task.task19.task1916;

import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

import java.io.*;

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static ArrayList<String> fc1 = new ArrayList<String>(50);
    public static ArrayList<String> fc2 = new ArrayList<String>(50);

    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        /*String file1 = conReader.readLine();
        String file2 = conReader.readLine();*/
        conReader.close();

        String file1 = "d:\\11.txt";
        String file2 = "d:\\12.txt";

        BufferedReader f1 = new BufferedReader(new FileReader(file1));
        BufferedReader f2 = new BufferedReader(new FileReader(file2));

        while (f1.ready())
            fc1.add(f1.readLine());
        f1.close();

        while (f2.ready())
            fc2.add(f2.readLine());
        f2.close();


        String chk, s1, s2, s3;
        for (int i = 0; i < fc1.size(); i++) {
            chk = fc1.get(i);

            if (i > 0)
                s1 = fc2.get(i - 1);
            else
                s1 = null;

            if (i < fc2.size())
                s2 = fc2.get(i);
            else
                s2 = null;

            if (i+1 < fc2.size())
                s3 = fc2.get(i + 1);
            else
                s3 = null;


            if (!chk.equals(s1) && !chk.equals(s2) && !chk.equals(s3)) {
                lines.add(new LineItem(Type.REMOVED, chk));
                fc2.add(i, chk);
            }

            if (!chk.equals(s1) && !chk.equals(s2) && chk.equals(s3)) {
                lines.add(new LineItem(Type.ADDED, s2));
                fc1.add(i, s2);
            }

            if (!chk.equals(s1) && chk.equals(s2) && !chk.equals(s3)) {
                lines.add(new LineItem(Type.SAME, chk));
            }
        }

        //Show
        for (LineItem ll : lines)
            System.out.println(ll.type + " " + ll.line);
            /*if (ll != null)
                System.out.println(ll.type + " " + ll.line);*/
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}