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
    ArrayList<Card> cards = new ArrayList<>();

    @Before
    public void before(){
        player = new Player("Ross", new Hand(), new PayOffPile(cards), new SideStack(), 0);
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
