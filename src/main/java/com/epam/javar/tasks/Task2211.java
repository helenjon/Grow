package com.epam.javar.tasks;

import java.io.*;
import java.nio.charset.Charset;
import java.io.IOException;

/*
Смена кодировки
*/

public class Task2211 {
    public static void main(String[] args) throws IOException {

        File infile = new File("D:\\My doc\\Authomation\\JavaRush\\reading_data-from_file.txt");
        File outfile = new File("D:\\My doc\\Authomation\\JavaRush\\write_data-to_file.txt");
        InputStream in = new FileInputStream(infile);
        OutputStream out = new FileOutputStream(outfile);
        Charset koi8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("Windows-1251");
        byte[] buffer = new byte[1000];
        in.read(buffer);
        String s = new String(buffer, windows1251);
        buffer = s.getBytes(koi8);
        out.write(buffer);
        in.close();
        out.close();




      }
    }


