package com.epam.javar.tasks;



import java.util.LinkedList;
import java.util.List;

/*
Исправь четыре ошибки
*/

public class Task0414 {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();
        //3
        double t = 1000f;
        list.add(t);
        list.add(new Double("123e-445632"));
        float tt = -90 / -3;
        list.add(tt);
        list.remove(new Double("123e-445632"));

        //4 - Исправь 2 ошибки
        for (int i = 0; i <= list.size(); i++) System.out.println(list.get(i));

        //5
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Double a = (double) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Float a = (float) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}
