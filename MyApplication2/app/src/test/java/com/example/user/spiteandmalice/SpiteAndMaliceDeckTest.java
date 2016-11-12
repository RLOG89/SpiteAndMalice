package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class SpiteAndMaliceDeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck(3);
    }

    @Test
    public void populatedThreeDecks() {
        assertEquals(156, deck.getDeck().size());
    }
}
