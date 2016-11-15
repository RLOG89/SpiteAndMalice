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

    // If centreStack isEmpty, 1st card played must be an ace (value1)
//    public Card FirstCardPlayedMustBeAce(Card card) {
//        boolean cardIsAce = false;
//        if (centreStack.getStack(1).isEmpty()) {
//            centreStack.addCard();
//        }
//    }

    //next card to be played to centreStack must be +1 value to the last (*kings*)
//    public void CheckCardIsAllowedToBePlayedToCentreStack(Player player, Hand hand) {
//        boolean playable = false;
//        for (Card card : player.getHand()) {
//
//        }
//    }

    public boolean centreStackPlayCheck(Card card) {
        if (card.getValue() == centreStack.getStack(1).size()+1) {
            return true;
        }
        else return false;
    }

    // for each card check if value is +1 of centrestack.size if yes play if no do nothing


}
