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
    private Player player;
    private int maxNumCardsInHand;
    private int maxNumCardsInPile;
    private int last = (spiteAndMaliceDeck.size() - 1);

    public Game (CentreStack centreStack, Deck deck, ArrayList<Player> players, int maxNumCardsInHand, int maxNumCardsInPile) {
        this.maxNumCardsInHand = maxNumCardsInHand;
        this.maxNumCardsInPile = maxNumCardsInPile;
        this.centreStack = centreStack;
        this.deck = deck;
        this.players = players;
        createSpiteAndMaliceDeck();
        setup();
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

    public void dealCardsToPlayerHand() {
        int currentCards = player.getHandSize();
        for (Player player : players);
            while (currentCards < this.maxNumCardsInHand)
                player.getHand().addCard(spiteAndMaliceDeck.remove(last));
    }

    public void dealCardsToPlayerPile() {
        int currentPile = player.getPileSize();
        for (Player player : players);
            while (currentPile < this.maxNumCardsInPile)
                player.getPayOffPile().addCard(spiteAndMaliceDeck.remove(last));

    }

    public void setup() {
        dealCardsToPlayerHand();
        dealCardsToPlayerPile();
    }


}
