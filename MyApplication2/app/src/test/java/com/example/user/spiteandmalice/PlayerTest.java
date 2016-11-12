package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Ross", new Hand(), new Scoring());
    }

    @Test
    public void canGetName() {
        assertEquals("Ross", player.getName());
    }
}
