package com.epam.javabasics.hometask12;

import java.util.HashMap;
import java.util.Map;


public class Test {

    static final Map<Integer, String> Maptest = new HashMap<>();

    static {
        Maptest.put(0, "ноль");
        Maptest.put(1, "one");
        Maptest.put(2, "two");
        Maptest.put(3, "tree");
        Maptest.put(4, "ноль");
        Maptest.put(5, "ноль");
        Maptest.put(6, "ноль");
        Maptest.put(7, "ноль");
        Maptest.put(8, "ноль");
        Maptest.put(9, "ноль");
        Maptest.put(10, "ноль");
        Maptest.put(11, "ноль");
        Maptest.put(12, "ноль");
    }


    public static void main(String[] args) {

        String test = "Это стоит 1 бакс, а вот это - 12 .";
        String[] line = test.split(" ");

        for (String stringLine : line) {
            if (stringLine.matches("\\d+")) {
                System.out.println(stringLine);
                if (Maptest.containsKey(Integer.valueOf(stringLine))) stringLine = Maptest.get(Integer.valueOf(stringLine));
                System.out.println(stringLine);
            }

        }


    }

}
