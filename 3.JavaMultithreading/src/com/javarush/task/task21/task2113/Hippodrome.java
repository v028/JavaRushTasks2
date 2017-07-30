package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitaly Yakovlev on 16.07.2017.
 */
public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("Первая лошадка", 3.00, 0.00);
        Horse horse2 = new Horse("Вторая лошадка", 3.00, 0.00);
        Horse horse3 = new Horse("Третья лошадка", 3.00, 0.00);
        game = new Hippodrome(new ArrayList());
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();
    }

    public Hippodrome(List horses) {
        this.horses = horses;
    }
    public static Hippodrome game;
    private List<Horse> horses;
    public List getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }
    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        int numBerOfWinner = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > maxDistance) {
                maxDistance = horses.get(i).getDistance();
                numBerOfWinner = i;
            }
        }
        return horses.get(numBerOfWinner);
    }
    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
