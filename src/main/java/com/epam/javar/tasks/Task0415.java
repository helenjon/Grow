package com.epam.javar.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0415 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer sizea = Integer.valueOf(reader.readLine());
        Integer sizeb = Integer.valueOf(reader.readLine());
        Integer sizec = Integer.valueOf(reader.readLine());

        String t = (((sizea+sizeb==sizec)||(sizea+sizec==sizeb) ||(sizec+sizeb == sizea)) ||
                ((sizea+sizeb<sizec)||(sizea+sizec<sizeb) ||(sizec+sizeb < sizea)
        ) ?
                "Треугольник не существует":"Треугольник существует");
        System.out.println(t);

    }
}
