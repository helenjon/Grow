package lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Library {

    public static void main (String[] args) throws IOException {

        String fromFile;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\My doc\\Idea_projects\\grow\\Lesson12_HT.txt"));
        while((fromFile = reader.readLine()) != null ){
            if(!fromFile.isEmpty()){
                System.out.println(fromFile);
            }
        }


    }

}
