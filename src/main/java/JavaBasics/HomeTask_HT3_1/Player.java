package JavaBasics.HomeTask_HT3_1;

import java.util.ArrayList;

public class Player {

    ArrayList<Card> cards = new ArrayList<>();

    Player(Desk desk){
        for (int i=0; i<6; i++ ){
            cards.add(desk.getCard());
        }
    }

}
