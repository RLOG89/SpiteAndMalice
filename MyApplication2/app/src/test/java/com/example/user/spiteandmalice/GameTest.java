package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game(new CentreStack(), new Deck(3), new ArrayList<Player>());
    }

    @Test
    public void spiteAndMaliceDeckHasCorrectNumberOfCards() {
        assertEquals(156, (game.getSpiteAndMaliceDeck().size()));
    }
}
