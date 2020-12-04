package com.epam.javar.tasks;

public class Task1328 {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String result;
        try {
            int index = string.indexOf("\t") + 1;
            result = string.substring(index, string.indexOf("\t", index));
        }catch (StringIndexOutOfBoundsException e) {
            throw new TooShortStringException();
        }
        return result;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString(null));
    }

}
