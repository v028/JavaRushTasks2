package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson {
    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }

    public int getCourse() {
        return course;
    }

    public void incAverageGrade(double delta) {
        double averageGrade = getAverageGrade();
        averageGrade += delta;
        setAverageGrade(averageGrade);
    }

    public void setAverageGrade(double value) {
        this.averageGrade = value;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setBeginningOfSession(Date date) {

        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {

        endOfSession = date;
    }

    /*public void setEndOfSession(int day, int month, int year) {

        endOfSession = new Date(year, month, day);
    }*/

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getPosition() {
        return "Студент";
    }
}