package com.epam.javabasics.hometask3and1;

public class WorkWithDesk {

    public static void main(String[] args) {
        Deck one = new Deck();
        one.setCards(new Card("runck1", "suit2"));
        one.setCards(new Card("runck1", "test2"));
        System.out.println(one.getCard(1).rank);
    }
}



