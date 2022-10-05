package com.alok.Demo;

import java.util.ArrayList;
import java.util.List;

public class Team {

    String name;

    List<Player> players = new ArrayList<>();

    Team(String name) {
        this.name = name;

    }
    public void setPlayers() {
        Player p1 = new Player("Dhoni");
        Player p2 = new Player("Kohili");
        Player p3 = new Player("Rohit");
        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        this.players = players;
    }
}

class Player {

    String name;

    Player(String name) {
        this.name = name;
    }

}

class Main {

    public static void main(String[] args) {

        Team team = new Team("India");
        team.setPlayers();
    }
}