package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class PayOffPileTest {

    PayOffPile payOffPile;
    Card card;

    @Before
    public void before() {
        payOffPile = new PayOffPile();
        card = new Card(Rank.JACK, Suit.SPADES);
    }

    @Test
    public void canAddCardToPayOffPile() {
        payOffPile.addCard(card);
        assertEquals(1, payOffPile.getPayPile().size());
    }
}
