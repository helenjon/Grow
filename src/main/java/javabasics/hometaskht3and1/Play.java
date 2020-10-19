package javabasics.hometaskht3and1;
//"Write a class whose instances represent a single playing card from a deck of cards. Playing cards have two distinguishing
//        properties: rank and suit.
//        1.a. Extend previous task by adding a new class named Deck which is holding a full deck of cards. Write a third class with
//main method to test you Deck. The Deck class should be able to draw a card one by one till the deck ends.
//        1.b. Write another class with the main method which will test the Deck class by calling its methods."


public class Play {

    public static void main(String[] args) {

        StartGame newGame = new StartGame();
        newGame.getPlayers();
        System.out.println(newGame.getPlayers().get(0).cards.get(1).getSuit());
    }

}
