package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Hand {

   private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int addStartingHand() {
        int cardsInHand = 0;
            for (Card card : hand) {
                if (hand.size() < 5) {
                    cardsInHand ++;
                }
            }
        return cardsInHand;
    }
}
