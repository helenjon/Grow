package JavaBasics.HomeTask_HT3_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Desk {

    private ArrayList<Card> desklist = new ArrayList<>();
    int cardNumber = 0;
    Card card;

    public Desk() {
         HashSet<Card> deskset = new HashSet<>();
         while (deskset.size() < 15) {
            deskset.add(Card.values()[new Random().nextInt(Card.values().length)]);
        }
        desklist.addAll(deskset);
    }

    public Card getCard (){
        card = desklist.get(cardNumber);
        desklist.remove(cardNumber);
        return card;
    }
}

