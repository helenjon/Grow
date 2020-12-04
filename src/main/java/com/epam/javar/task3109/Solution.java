package com.epam.javar.task3109;

import java.io.*;
import java.nio.file.Paths;
import java.util.Properties;

/*
Читаем конфиги
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/main/java/com/epam/javar/task3109/properties.txt");
        //   System.out.println(properties.getProperty("name"));
        properties.list(System.out);

        properties = solution.getProperties("src/main/java/com/epam/javar/task3109/properties.xml");
        properties.put("test", "test");
//        try {
//            properties.list(new PrintStream(new FileOutputStream(Paths.get("src/main/java/com/epam/javar/task3109/properties.xml").toFile())));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        properties.list(System.out);


        properties = solution.getProperties("notExists");
        properties.list(System.out);

    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();

        if (fileName.substring(fileName.length() - 3).equals("xml")) {
            try {
                properties.loadFromXML(new FileInputStream(fileName));
            } catch (IOException e) {
                return properties;
            }
        } else {
            try {
                properties.load(new FileReader(Paths.get(fileName).toFile()));
            } catch (IOException e) {
                return properties;
            }
        }
        return properties;
    }
}
