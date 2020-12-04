package com.epam.javar.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0421 {
    public static void main(String[] args)  {
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                while ( true) {
                    System.out.println(MovieFactory.getMovie(reader.readLine()).getClass().getSimpleName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                ;
            }
        }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;

        }
    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }


        private static class Cartoon extends Movie {

        }

        private static class Thriller extends Movie {

        }
    }
}