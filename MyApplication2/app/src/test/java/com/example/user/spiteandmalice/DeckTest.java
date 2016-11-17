package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck(1);
    }

    @Test
    public void deckIsPopulated(){
        assertEquals(52, deck.size());
    }


}
