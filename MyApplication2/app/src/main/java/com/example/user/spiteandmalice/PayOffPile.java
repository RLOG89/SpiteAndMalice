package com.example.user.spiteandmalice;

import java.util.ArrayList;

public class PayOffPile {

    private ArrayList<Card> cards;

    public PayOffPile() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getPayPile() {
        return cards;
    }

    public Card removeCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}

