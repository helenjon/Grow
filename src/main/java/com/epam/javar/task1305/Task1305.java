package com.epam.javar.task1305;

public class Task1305 {

   public static void main(String[] args) {

            System.out.println(Dream.HOBBY.toString());
            System.out.println(new Hobby().toString());

        }

        interface Desire {
        }

        interface Dream {
            public static Hobby HOBBY = new Hobby();
        }

        static class Hobby implements Dream, Desire {
            static int INDEX = 1;

            @Override
            public String toString() {
                INDEX++;
                return "" + INDEX;
            }
        }

    }

