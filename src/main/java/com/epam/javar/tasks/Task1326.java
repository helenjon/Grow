package com.epam.javar.tasks;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.nio.charset.StandardCharsets;

/*
StringTokenizer
*/

public class Task1326 {
    public static void main(String[] args) throws IOException {

//        FileReader reader = new FileReader(args[0]);

        String link1 = "D:\\My doc\\Authomation\\JavaRush\\reading_data-from_file.txt";
        String link2 = "D:\\My doc\\Authomation\\JavaRush\\write_data-to_file.txt";
        FileReader reader = new FileReader(link1);
        Scanner scanner = new Scanner(reader);
        FileWriter writer = new FileWriter(link2);
        while (scanner.hasNext()){
            byte[] tt = scanner.next().getBytes("UTF-8");
            for (byte b: tt)
                writer.write(b);
        }
        reader.close();
        writer.close();

    }
}