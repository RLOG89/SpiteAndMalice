package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class PlayerTest {

    Player player;
    Card card;
    Card card2;
    ArrayList<Card> cards = new ArrayList<>();

    @Before
    public void before(){
        player = new Player("Ross", new Hand(), new PayOffPile(), new SideStack());
        card = new Card (Rank.ACE, Suit.CLUBS);
        card2 = new Card (Rank.ACE, Suit.SPADES);
    }

    @Test
    public void canGetName() {
        assertEquals("Ross", player.getName());
    }

    @Test
    public void canGetPoints() {
        assertEquals(0, player.getCurrentPoints());
    }
}
