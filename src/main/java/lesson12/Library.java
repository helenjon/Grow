package lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Library {

    public static void main(String[] args) {

        String name;
        String author;
        Integer year;
        String level;
        Integer id = 1;
        String fromFile;
        Map<Integer, Book> bookCollection = new HashMap<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\My doc\\Idea_projects\\grow\\Lesson12_HT1.txt"));
            while ((fromFile = reader.readLine()) != null) {
                if (!fromFile.isEmpty()) {
                    name = fromFile.split(",")[0];
                    author = fromFile.split(",")[1];
                    year = Integer.parseInt(fromFile.split(",")[2]);
                    level = fromFile.split(",")[3];

                    Book book = new Book(name, author, year, level);
                    bookCollection.put(id, book);
                    //  for check System.out.println(bookCollection.get(id).getAuthor());
                    id = id + 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


