package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Game {

    private CentreStack centreStack;
    private ArrayList<Card> spiteAndMaliceDeck = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck;

    public Game (CentreStack centreStack, Deck deck, ArrayList<Player> players) {
        this.centreStack = centreStack;
        this.deck = deck;
        this.players = players;
        createSpiteAndMaliceDeck();
    }

    public void createSpiteAndMaliceDeck() {
        for (Card card : deck.getDeck()) {
            spiteAndMaliceDeck.add(card);
        }
    }

    public ArrayList<Card> getSpiteAndMaliceDeck() {
        return spiteAndMaliceDeck;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void dealCardsToPlayer() {
        for (Player player : players)

    }



}
