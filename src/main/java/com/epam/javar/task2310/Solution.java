package com.epam.javar.task2310;

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    private void sout() {
        new Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Риша").sout();

    }
}