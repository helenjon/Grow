package com.epam.javar.tasks;

import java.io.*;


public class Task1319 {
//D:\My doc\Authomation\test2.txt
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer;
        String string = reader.readLine();
        writer = new BufferedWriter(new FileWriter(string));
        string = reader.readLine();
        while (!string.equals("exit")) {
            writer.write(string);
            writer.newLine();
            string = reader.readLine();
        }
        writer.write(string);
        writer.close();

    }

}
