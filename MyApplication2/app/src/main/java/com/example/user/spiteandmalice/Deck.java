package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(int numberOfDecks) {
        populate(numberOfDecks);
    }

    private void populate(int decks) {
        int counter;
        for (counter = 0; counter < decks; counter++){
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
}
