package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class CentreStackTest {

    CentreStack centreStack;
    Card card;

    @Before
    public void before() {
        centreStack = new CentreStack();
        card = new Card(Rank.KING, Suit.CLUBS);
    }

    @Test
    public void canAddCardToCentreStack() {
        assertEquals(0, centreStack.getStack(1).size());
        centreStack.addCard(1, card);
        assertEquals(1, centreStack.getStack(1).size());
    }

    @Test
    public void centreStackStartsEmpty() {
        assertEquals(0, centreStack.getStack(1).size());
    }
}
