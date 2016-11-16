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
    private int maxNumCardsInHand;
    private int maxNumCardsInPile;

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

    public CentreStack getCentreStack() {
        return centreStack;
    }

    public boolean checkPlayerHandSizeValid(Player player) {
        boolean handFull = false;
        if (player.getHandSize() < maxNumCardsInHand) {
            handFull = true;
        }
        return handFull;
    }

    public boolean checkPlayerPileSizeValid(Player player) {
        boolean pileFull = false;
        if (player.getPileSize() < maxNumCardsInPile) {
            pileFull = true;
        }
        return pileFull;
    }

    public void dealCardsToPlayerHand() {
        for (Player player : players) {
            while (checkPlayerHandSizeValid(player)) {
                player.getHand().addCard(spiteAndMaliceDeck.remove(0));
            }
        }
    }

    public void dealCardsToPlayerPile() {
        for (Player player : players) {
            while (checkPlayerPileSizeValid(player)) {
                player.getPayOffPile().addCard(spiteAndMaliceDeck.remove(0));
            }
        }
    }

    public void setup() {
        dealCardsToPlayerHand();
        dealCardsToPlayerPile();
    }

    public boolean centreStackValidMoveCheck(int stack, Card card) {
        if (card.getValue() == centreStack.getStack(stack).size()+1) {
            return true;
        }
        else return false;
    }
        // loop through players hand to find card //

    public boolean playerHasCard(Player player, Card card) {
        for (int i = 0; i < player.getHand().cards.size(); i++) {
            if (player.getHand().cards.get(i).getValue() == card.getValue()) {
                return true;
            }
        }
        return false;
    }

    /* for each card check if value is +1 of centreStack.size if yes play if no do nothing
    add check for if null move on so doesn't crash
     */

    public void moveCardFromHandToCentre(int stack, Card card, Player player) {
        if (!playerHasCard(player, card)){return ;}
        if (centreStackValidMoveCheck(stack, card) == true) {
            player.playCard(card);
            centreStack.addCard(stack, card);
        }
        else return ; // throw exception //
    }

    public boolean playerHasCardInPayOffPile(Player player) {
        if (player.getPileSize() == 0) {
            return false;
        }
        return true;
    }

    public boolean isGameOver() {
        for (Player player : players) {
            if (playerHasCardInPayOffPile(player) == false) {
                return true;
            }
        }
        return false;
    }

    public int getScoreForPlayer(Player player) {
        for (player : players) {
        if (playerHasCardInPayOffPile(player) == true) {

            }
        }
    }

}
