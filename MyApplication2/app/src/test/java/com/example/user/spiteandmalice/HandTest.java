package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class HandTest {
    Hand cards;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;

    @Before
    public void before() {
        cards = new Hand();
        card1 = new Card(Rank.FIVE, Suit.CLUBS);
        card2 = new Card(Rank.TEN, Suit.CLUBS);
        card3 = new Card(Rank.EIGHT, Suit.HEARTS);
        card4 = new Card(Rank.ACE, Suit.SPADES);
        card5 = new Card(Rank.KING, Suit.DIAMONDS);
    }

    @Test
    public void canAddCard() {
        cards.addCard(card1);
        assertEquals(Suit.CLUBS, cards.getHand().get(0).getSuit());
    }

    @Test
    public void canGetSize() {
        cards.addCard(card1);
        cards.addCard(card2);
        assertEquals(2, cards.getHand().size());
    }

    @Test
    public void canRemoveCard() {
        cards.addCard(card1);
        cards.removeCard(card1);
        assertEquals(0, cards.getHand().size());
    }

    @Test
    public void cardAtIndexIsRemoved() {
        cards.addCard(card1);
        cards.addCard(card2);
        cards.addCard(card3);
        cards.removeCard(card1);
        assertEquals(Rank.TEN, cards.getHand().get(0).getRank());
    }

}
