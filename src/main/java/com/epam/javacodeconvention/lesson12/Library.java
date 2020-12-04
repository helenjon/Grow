package com.epam.javacodeconvention.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Library {

    public static void main(String[] args) {

        Map<Integer, BookInfo> bookCollection = new HashMap<Integer, BookInfo>();
        Integer id = 1;
        String fromFile;
        String URL = "C:\\My doc\\Idea_projects\\grow\\Lesson12_HT1.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(URL));
            while ((fromFile = reader.readLine()) != null) {
                if (!fromFile.isEmpty()) {
                   String name = fromFile.split(",")[0];
                   String author = fromFile.split(",")[1];
                   Integer year = Integer.parseInt(fromFile.split(",")[2]);
                   String level = fromFile.split(",")[3];
                   bookCollection.put(id, new BookInfo(name, author, year, level));
                    //  for check
                   System.out.println(bookCollection.get(id).getAuthor());
                   id ++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


