package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(Rank.ACE, Suit.CLUBS);
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.CLUBS, card.getSuit());
    }
}
