package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        private ATableInterface table;

        @Override
        public void setModel(List rows) {
            this.table.setModel(rows);
            System.out.println(rows.size());
        }

        public TableInterfaceWrapper(ATableInterface table) {
            this.table = table;
        }

        @Override
        public String getHeaderText() {
            return table.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            table.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}