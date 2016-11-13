package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class HandTest {
    Hand hand;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;

    @Before
    public void before() {
        hand = new Hand();
        card1 = new Card(Rank.FIVE, Suit.CLUBS);
        card2 = new Card(Rank.TEN, Suit.CLUBS);
        card3 = new Card(Rank.EIGHT, Suit.HEARTS);
        card4 = new Card(Rank.ACE, Suit.SPADES);
        card5 = new Card(Rank.KING, Suit.DIAMONDS);
    }

    @Test
    public void canAddCard() {
        hand.addCard(card1);
        assertEquals(1, hand.getHand().size());
    }

    
}
