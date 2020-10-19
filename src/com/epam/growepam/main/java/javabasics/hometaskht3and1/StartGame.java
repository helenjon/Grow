package javabasics.hometaskht3and1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class StartGame {

    private final ArrayList<Player> players = new ArrayList<>();
    private Desk desk;
    private Integer numberOfPlayers;

    public StartGame() {
        System.out.println("Start game?");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String answer = null;
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer.equals("y")) {
            desk = new Desk();
            System.out.println("How many players?");
        } else System.exit(0);
        try {
            numberOfPlayers = Integer.valueOf(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        createPlayers();
    }

    private void createPlayers() {
        while (numberOfPlayers > 0) {
            players.add(new Player(desk));
            numberOfPlayers--;
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }


}

