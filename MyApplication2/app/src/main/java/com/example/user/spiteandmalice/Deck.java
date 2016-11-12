package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Deck {

    ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        populate();
    }

    private void populate() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public int size() {
        return cards.size();
    }
}
