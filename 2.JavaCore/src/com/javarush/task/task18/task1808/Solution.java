package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String file1 = r.readLine();
        String file2 = r.readLine();
        String file3 = r.readLine();

        FileInputStream file1Content = new FileInputStream(file1);
        FileOutputStream file2Content = new FileOutputStream(file2);
        FileOutputStream file3Content = new FileOutputStream(file3);

            int middle, count;
            while (file1Content.available() > 0){
                byte[] buff = new byte[file1Content.available()];
                count = file1Content.read(buff);
                middle = count%2==0 ? count/2 : (count/2)+1;
                file2Content.write(buff, 0, middle);
                file3Content.write(buff, middle, count-middle);
            }

        file1Content.close();
        file2Content.close();
        file3Content.close();
    }
}
