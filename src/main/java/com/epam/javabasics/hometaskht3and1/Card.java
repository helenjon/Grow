package com.epam.javabasics.hometaskht3and1;

enum Card {
    JackCher("Jack", "Cher"),
    IceCher("Ice", "Cher"),
    TenCher("Ten", "Cher"),
    JackIce("Jack", "Ice"),
    IceIce("Ice", "Ice"),
    TenIce("Ten", "Ice"),
    eightIce("eight", "Cher"),
    nineIce("nine", "Cher"),
    eightCher("eight", "Cher"),
    nineCher("nine", "Cher"),
    sevenCher("seven", "Cher"),
    fourCher("four", "Cher"),
    fourIce("four", "Ice"),
    fiveCher("five", "Cher"),
    fiveIce("five", "Ice");

    private final String runck;
    private final String suit;

    Card(String suit, String runck) {
        this.suit = suit;
        this.runck = runck;
    }

    public String getRank() {
        return runck;
    }

    public String getSuit() {
        return suit;
    }
}











