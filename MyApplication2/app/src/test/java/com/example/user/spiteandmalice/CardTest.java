package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

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

    @Test
    public void canOutputCardToString() {
        assertEquals("ACE of CLUBS", card.toString());
    }

    @Test
    public void canGetValue() {
        assertEquals(1, card.getValue());
    }
}
