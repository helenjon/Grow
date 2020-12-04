package com.epam.javar.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем паттерн Singleton
*/

public class Solution {

    public static Planet thePlanet;

    {
        readKeyFromConsoleAndInitPlanet();
//        System.out.println(thePlanet.getClass().getSimpleName());
    }


    public static void main(String[] args) {
        new Solution();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tt = null;
        try {
            tt = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tt.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
            //  System.out.println("111");
        }
        else if (tt.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        }
        else if (tt.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        }
        else thePlanet = null;
    }
}
