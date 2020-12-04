package com.epam.javar.tasks;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;


public class Task1327 {

        public static void main(String[] args)  {
            //"D:\My doc\Authomation\JavaRush\reading_data-from_file.txt"
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList <Integer> values= new ArrayList<>();
            try {
              //  FileReader fr  = new FileReader(reader.readLine());
                FileInputStream fi = new FileInputStream(reader.readLine());
                Scanner scan = new Scanner(fi);
                while(scan.hasNext()){
                    values.add(Integer.valueOf(scan.next()));
                }
            fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            values.stream().filter(e -> e%2==0).sorted().forEach(System.out::println);

                   }
    }



