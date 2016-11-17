package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

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
