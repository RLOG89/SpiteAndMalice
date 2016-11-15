package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class GameTest {

    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Card> cards = new ArrayList<>();
    Game game;
    Player ross = new Player("Ross", new Hand(), new PayOffPile(cards));
    Player bobby = new Player("Bobby", new Hand(), new PayOffPile(cards));

    @Before
    public void before() {
        players.add(ross);
        players.add(bobby);
        game = new Game(new CentreStack(), new Deck(3), players, 5, 20);
    }

    @Test
    public void spiteAndMaliceDeckHasCorrectNumberOfCards() {
        assertEquals(156, (game.getSpiteAndMaliceDeck().size()));
    }

    @Test
    public void canAddPlayers() {
        assertEquals(2, game.getPlayers().size());
    }

    @Test
    public void playerStartsWithFiveCardsInHand() {
        assertEquals(5, ross.getHandSize());
        assertEquals(5, bobby.getHandSize());
    }

    @Test
    public void playerStartsWithTwentyCardsInPile() {
        assertEquals(20, ross.getPileSize());
        assertEquals(20, bobby.getPileSize());
    }
}
