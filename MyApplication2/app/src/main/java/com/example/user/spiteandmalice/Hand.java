package com.example.user.spiteandmalice;

import java.util.ArrayList;

public class Hand {

    public ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getHand() {
        return cards;
    }

    public Card removeCard(Card card) {
        Card returnCard = null;

        if (!(cards.size() == 0)) {
            for (int i = 0; i < this.cards.size(); i++) {
                if (this.cards.get(i).getValue() == card.getValue()) {
                    returnCard = this.cards.remove(i);
                }
            }
        }
        return returnCard;
    }

    public void removeCardAtIndex(){
        this.cards.remove(0);
    }

}



