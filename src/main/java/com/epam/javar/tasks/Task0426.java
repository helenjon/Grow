package com.epam.javar.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0426 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String test = reader.readLine();
        String rez = "";
        if (Integer.valueOf(test) != 0) {
            if (test.matches("-[0-9]*")) {
                rez = rez + "отрицательное";

            } else rez = rez + "положительное";

            if (Integer.valueOf(test) % 2 == 0) System.out.println(rez + " " + "четное число");
            else System.out.println(rez + " " + "нечетное число");
        } else System.out.println("равно 0");
    }

}
