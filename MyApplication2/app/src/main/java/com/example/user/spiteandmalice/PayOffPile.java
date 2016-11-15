package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class PayOffPile {

    private ArrayList<Card> cards;

    public PayOffPile() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getPayPile() {
        return cards;
    }

    public Card removeCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}

