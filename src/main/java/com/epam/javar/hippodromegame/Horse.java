package com.epam.javar.hippodromegame;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Horse {

    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move(){
        int max = 10;
        int min = 1;
        int range = max - min + 1;
//        speed = (int)(Math.random() * range) + min;
//        distance += speed;
        distance += speed*Math.random();
    }

    public void print(){
        String point = ".";
        String sRepeated = IntStream.range(0, (int) distance).mapToObj(i -> point).collect(Collectors.joining(""));
        System.out.println(sRepeated+name);
    }




}
