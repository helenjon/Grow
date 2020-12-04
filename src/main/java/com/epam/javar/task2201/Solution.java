package com.epam.javar.task2201;

import java.awt.*;

public class Solution {

    public static void main(String[] args) {
        new Solution();


    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public Solution() {
        initThreads();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");


        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());

        this.thread1.start();
        this.thread2.start();
        this.thread3.start();


    }


    public synchronized String getPartOfString(String string, String threadName) {
        String rez = "";
        try {
            String[] str = string.split("\t");
            for (int i = 1; i < str.length - 1; i++) {
                rez = rez + str[i] + "\t";
                System.out.println(rez);
            }
            return rez.substring(0, rez.length() - 1);
        } catch (IndexOutOfBoundsException e) {
            if (threadName.equals(SECOND_THREAD_NAME)) {
                throw new StringForSecondThreadTooShortException(e);

            }

            if (threadName.equals(FIRST_THREAD_NAME)) {
                throw new StringForFirstThreadTooShortException(e);
//
            }
            else {
                throw new RuntimeException(e);
            }

        }

    }
}
