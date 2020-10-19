package com.epam.javabasics.hometask12;

//Самостоятельно разберитесь с классом(классами) в Java, позволяющими читать
//        символьные данные из файла. Создайте файл, содержащий информацию о книгах
//        из библиотеки, прочитайте его, и на основе прочитанной информации создайте
//        коллекцию книг.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeTask12 {

    public static void main(String[] args) throws IOException {

        String fromFile;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\My doc\\Idea_projects\\grow\\Lesson12_HT.txt"));
        while ((fromFile = reader.readLine()) != null) {
            if (!fromFile.isEmpty()) {
                System.out.println(fromFile);
            }
        }


    }


}

