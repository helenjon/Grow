package com.epam.javabasics.hometaskht3and1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Desk {

    final int cardNumber = 0;
    private final ArrayList<Card> desklist = new ArrayList<>();
    Card card;

    public Desk() {
        HashSet<Card> deskset = new HashSet<>();
        while (deskset.size() < 15) {
            deskset.add(Card.values()[new Random().nextInt(Card.values().length)]);
        }
        desklist.addAll(deskset);
    }

    public Card getCard() {
        card = desklist.get(cardNumber);
        desklist.remove(cardNumber);
        return card;
    }
}

