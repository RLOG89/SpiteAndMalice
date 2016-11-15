package com.example.user.spiteandmalice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 12/11/2016.
 */

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(int numberOfDecks) {
        populate(numberOfDecks);
        shuffle();
    }

    private void populate(int decks) {
        for (int counter = 0; counter < decks; counter++){
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
}
