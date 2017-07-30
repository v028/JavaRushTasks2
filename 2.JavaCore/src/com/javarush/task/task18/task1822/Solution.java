package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        int id = Integer.parseInt(args[0]);

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileReader.readLine();
        FileInputStream reader = new FileInputStream(fileName);
        BufferedReader in = new BufferedReader(new FileReader(fileName));

        while (in.ready()) {
            String idValue = "";
            String content = in.readLine();
            for (int i = 0; i < content.length(); i ++) {
                if (!content.substring(i, i+1).equals(" ")) {
                    idValue += content.substring(i, i+1);
                } else break;
            }

            if (idValue.equals(String.valueOf(id))) {
                System.out.println(content);
            }
        }
        //reader.close();
        in.close();
        fileReader.close();
    }
}
