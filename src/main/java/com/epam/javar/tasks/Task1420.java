package com.epam.javar.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Task1420 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Integer a = 42;
//        Integer b = 24;
        Integer a = 0;
        Integer b = 0;
        try {
            a = Integer.parseInt (reader.readLine());
            b = Integer.parseInt (reader.readLine());
            if (a<0 || b<0) throw new NumberFormatException();
     //       a = Integer.valueOf(reader.readLine());
     //       b = Integer.valueOf(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getStackTrace());

        }
        if (a > 0 && b > 0)  {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;

            }
            System.out.println(a);
        }
    }
}


