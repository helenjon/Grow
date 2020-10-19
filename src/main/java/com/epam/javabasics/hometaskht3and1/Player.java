package com.epam.javabasics.hometaskht3and1;

import java.util.ArrayList;

public class Player {

    final ArrayList<Card> cards = new ArrayList<>();

    Player(Desk desk) {
        for (int i = 0; i < 6; i++) {
            cards.add(desk.getCard());
        }
    }

}
