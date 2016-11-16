package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 14/11/2016.
 */

public class CentreStackTest {

    CentreStack centreStack;
    Card card;
    Card card2;

    @Before
    public void before() {
        centreStack = new CentreStack();
        card = new Card(Rank.KING, Suit.CLUBS);
    }

    @Test
    public void canGetStack() {
        assertNotNull(centreStack.getStack(1));
    }

    @Test
    public void cantAddInvalidCardToCentreStack() {
        assertEquals(0, centreStack.getStack(1).size());
        centreStack.addCard(1, card);
        assertEquals(0, centreStack.getStack(1).size());
    }

    @Test
    public void canAddValidCardToCentreStack() {
        card2 = new Card(Rank.ACE, Suit.DIAMONDS);
        assertEquals(0, centreStack.getStack(1).size());
        centreStack.addCard(1, card2);
        assertEquals(1, centreStack.getStack(1).size());
    }

    @Test
    public void centreStackStartsEmpty() {
        assertEquals(0, centreStack.getStack(1).size());
    }

    @Test
    public void canClearStack() {
        card2 = new Card(Rank.QUEEN, Suit.HEARTS);
        centreStack.addCard(3, card);
        centreStack.addCard(3, card2);
        centreStack.resetStack(3);
        assertEquals(0, centreStack.getStack(3).size());
    }
}
