package com.epam.javar.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0428 {

    public static void main(String[] args) throws IOException {
        Integer negative = 0;
        Integer positive = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String test = reader.readLine();
            if (Integer.valueOf(test) != 0) {
                if (test.matches("-[0-9]*")) {
                    negative++;
                } else {
                    positive++;
                }
            }
        }
        if (positive > 0) System.out.println(positive);
        else System.out.println(0);


    }
}