package com.epam.javar.tasks;

public class Task2202 {

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }



    public static String getPartOfString(String string) {

        String index = "";

        try {
            if (string.split(" ").length<=4) throw new TooShortStringException();
            String[] test = string.split(" ");
            for (int i=1; i<=4; i++){
                index = index+test[i]+" ";
            }
            return index.substring(0,index.length()-1);
        } catch (NullPointerException e) {
            throw new TooShortStringException();
        }
        catch (Throwable e) {
            throw new TooShortStringException();
        }

    }

    public static class TooShortStringException extends RuntimeException {
        TooShortStringException() {
            System.out.println("test.size()");

        }
    }
}



