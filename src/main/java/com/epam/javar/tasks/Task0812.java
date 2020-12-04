package com.epam.javar.tasks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task0812 {
    public static void main(String[] args) throws IOException {

      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println(reader.readLine().length());
//        List<Integer> test = new ArrayList<>();
//        String tt;
//        for (int y = 0; y<10; y++)  {
//            tt= reader.readLine();
//            test.add(Integer.valueOf(tt));
//        }

       // ArrayList<String> test = new ArrayList<>(Arrays.asList(tt.split(",")));
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(2, 2, 2, 4, 4, 4, 4, 1, 3, 3));
        int max = 0;
        int count = max;
        int maxnumber = 0;

        for (int i = 0; i < test.size() - 1; i++) {
            if (Integer.valueOf(test.get(i)).equals(Integer.valueOf(test.get(i + 1)))) {

                count++;
                System.out.println("count" + count);
                max = count;
                System.out.println("max" + max);

            } else {
                if (max < count) {
                    max = count;
                    maxnumber = Integer.valueOf(test.get(i));
                }
                count = 0;
            }

        }
        if (maxnumber == 0 && max == 1) {

        } else {
            System.out.println("maxnumber" + maxnumber + "count" + (max+1));
        }


    }


}