package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class PayOffPile {

    private ArrayList<Card> payPile = new ArrayList<>(20);

    public PayOffPile(){
    }

    public ArrayList<Card> getPayPile() {
        return payPile;
    }

    public void addCard(Card card) {
        payPile.add(card);
    }
}
