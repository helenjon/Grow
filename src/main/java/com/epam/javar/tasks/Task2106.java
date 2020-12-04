package com.epam.javar.tasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class Task2106 {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Task2106 solution;

    public Task2106(int anInt, String string, double aDouble, Date date, Task2106 solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task2106)) return false;

        Task2106 solution1 = (Task2106) o;
        return anInt == solution1.anInt &&
                Objects.equals(string, solution1.string) &&
                Objects.equals(aDouble, solution1.aDouble) &&
                Objects.equals(date, solution1.date) &&
                Objects.equals(solution1.solution, solution);
    }

    @Override
    public int hashCode() {

        int result;
        long temp;
        result = anInt;
        temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) throws ParseException {

        HashSet<Task2106> set = new HashSet<>();
        Task2106 one = new Task2106(10, "test", 15.2,
                new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"), null);
        Task2106 second = new Task2106(10, "test", 15.2,
                new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"), null);
        set.add(one);
        set.add(second);
        System.out.println(second.equals(one));
        System.out.println(second.hashCode());
        System.out.println(second.hashCode());


    }
}

