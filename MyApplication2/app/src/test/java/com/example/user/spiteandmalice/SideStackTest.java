package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

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
        assertEquals(0, sideStack.getStack(1).size());
        sideStack.addCard(1, card);
        assertEquals(1, sideStack.getStack(1).size());
    }

    @Test
    public void newCardGoesToPosition1() {
        card2 = new Card(Rank.EIGHT, Suit.DIAMONDS);
        sideStack.addCard(2, card);
        sideStack.addCard(2, card2);
        assertEquals(2, sideStack.getStack(2).size());
        assertEquals("EIGHT of DIAMONDS", sideStack.getStack(2).get(0).toString());
    }

    @Test
    public void canRemoveCard() {
        sideStack.addCard(3, card);
        assertEquals(card, sideStack.removeCard(3));
    }
}
