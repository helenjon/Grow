package javabasics.hometask3and1;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    final List<Card> desk;

    public Deck() {
        desk = new ArrayList<>();
    }

    public void setCards(Card card) {
        desk.add(card);
    }

    public Card getCard(int index) {
        return desk.get(index);
    }

}


