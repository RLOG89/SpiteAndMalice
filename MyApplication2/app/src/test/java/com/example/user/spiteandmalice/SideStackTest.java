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
    Card card2;

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

    @Test
    public void newCardGoesToPosition1() {
        card2 = new Card(Rank.EIGHT, Suit.DIAMONDS);
        sideStack.AddCardToSideStack2(card);
        sideStack.AddCardToSideStack2(card2);
        assertEquals(2, sideStack.getSideStack2().size());
        assertEquals("EIGHT of DIAMONDS", sideStack.getSideStack2().get(0).toString());
    }
}
