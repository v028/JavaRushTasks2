package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] s = fileScanner.nextLine().split(" ");
            Date bday = new Date();
            bday.setDate(Integer.parseInt(s[3]));
            bday.setMonth(Integer.parseInt(s[4]));
            bday.setYear(Integer.parseInt(s[5]));
            Person person = new Person(s[1], s[0], s[2], bday);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
