package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class PayOffPile {

    private ArrayList<Card> cards;

    public PayOffPile(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getPayPile() {
        return cards;
    }

    public Card removeCard() {
        return cards.remove(cards.size() - 1);
    }
}
