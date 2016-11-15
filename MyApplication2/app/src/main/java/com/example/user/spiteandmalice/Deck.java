package com.example.user.spiteandmalice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 12/11/2016.
 */

/* refactor this later to make abstract / implement SpiteAndMaliceDeck.
In that case take out shuffle
 */

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>();
    private ArrayList<Card> cardsToDeal = new ArrayList<>();

    public Deck(int numberOfDecks) {
        populate(numberOfDecks);
        shuffle();
    }

    private void populate(int decks) {
        for (int counter = 0; counter < decks; counter++) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(rank, suit));
                }
            }
        }
    }

    public int size() {
        return cards.size();
    }

    public ArrayList<Card> getDeck() {
        return this.cards;
    }

    //choose another shuffle method later//
    private void shuffle(){
        Collections.shuffle(cards);
    }

    public ArrayList<Card> deal(int numCards) {
        for (int i = 0; i < numCards; i++) {
            cardsToDeal.add(cards.remove(cards.size() - 1));
        }
        return cardsToDeal;
    }

}
