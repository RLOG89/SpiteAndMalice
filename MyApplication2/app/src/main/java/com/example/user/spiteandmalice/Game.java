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

    public boolean playerHasCard(Player player, Card card) {
        for (int i = 0; i < player.getHand().cards.size(); i++) {
            if (player.getHand().cards.get(i).getValue() == card.getValue()) {
                return true;
            }
        }
        return false;
    }

    public void moveCard(Card card, Hand hand, int stack) {
        if (!hand.getHand().contains(card)){return ;}
        if (!centreStackValidMoveCheck(stack, card)) return;
        hand.removeCard(card);
        centreStack.getStack(stack).add(card);
    }

    public void moveCard(Card card, PayOffPile payOffPile, int stack) {
        if (!payOffPile.getPayPile().contains(card)){return ;}
        if (!centreStackValidMoveCheck(stack, card)) return;
        payOffPile.removeCard();
        centreStack.getStack(stack).add(card);
    }

    public void moveCard(Card card, SideStack sideStack, int stack) {
        if (!sideStack.contains(stack, card)){return ;}
        if (!centreStackValidMoveCheck(stack, card)) return;
        sideStack.removeCard(stack);
        centreStack.getStack(stack).add(card);
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

    public int getScoreForPlayer(Player player) throws Exception {
        if (isGameOver() == false) throw new Exception("The game has not ended");
        if (player.getPileSize() != 0) return 0;
        int points = 5;
        for (Player tempPlayer : players) {
            if (tempPlayer != player) {
                points += tempPlayer.getPileSize();
            }
        }
        return points;
    }

}
