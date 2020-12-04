package com.epam.javar.hippodromegame;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Hippodrome {

    private static List<Horse> horses = new LinkedList<>();
    ;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {

        horses.add(new Horse("test1", 3, 0));
        horses.add(new Horse("test2", 3, 0));
        horses.add(new Horse("test3", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }


    private void run(){
        for (int i=0;i<10; i++ ){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void move(){
        horses.get(0).move();
        horses.get(1).move();
        horses.get(2).move();

    }

    private void print(){
        horses.stream().forEach(e -> e.print());
        for(int i=0;i<10; i++ ) System.out.println();
    }

    public Horse getWinner(){
        double max = 0;
        Horse winner = null;
        for (Horse h : horses){
            if (h.distance>max) {
                winner=h;
            };
        }
        return winner;
    }
    public void printWinner(){
        System.out.println(String.format("Winner is %s!", getWinner().name));
    }

}
