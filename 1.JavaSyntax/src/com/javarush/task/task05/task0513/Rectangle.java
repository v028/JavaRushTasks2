package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

import org.w3c.dom.css.Rect;

public class Rectangle {
    int top, left, width, height;

    public void initialize(int left, int top, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int left, int top, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle r) {
        this.top = r.top;
        this.left = r.left;
        this.width = r.width;
        this.height = r.height;
    }

    public static void main(String[] args) {

    }
}
