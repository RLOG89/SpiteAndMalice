package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

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

    // predicate class .removeif? iterator? //

//    public Card removeCard(Card card) {
//        if (!(cards.size() == 0)) {
//            cards.removeIf (s -> !s.contains(card));
//        }
//    }

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



