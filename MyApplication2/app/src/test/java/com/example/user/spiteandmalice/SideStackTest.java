package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class SideStackTest {

    SideStack sideStack;
    Card card;

    @Before
    public void before() {
        sideStack = new SideStack();
        card = new Card(Rank.FIVE, Suit.CLUBS);
    }

    @Test
    public void canAddCardToSideStack() {
        sideStack.AddCardToSideStack1(card);
        assertEquals(1, sideStack.getSideStack1().size());
    }
}
