package com.epam.javar.tasks;


import java.util.HashMap;
import java.util.Map;

public class Task0420 {

    static Map<String, String> names = new HashMap<>();

    public static Map<String, String> createMap() {

        names.put("test1", "test9");
        names.put("test2", "test9");
        names.put("test24", "test7");
        names.put("test3", "test5");
        names.put("test71", "test7");
        return names;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

        return (int) map.entrySet().stream().filter(x -> x.getValue().equals(name)).count();

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        return (int) map.entrySet().stream().filter(x -> x.getKey().equals(lastName)).count();


    }

    public static void main(String[] args) {

    }
}