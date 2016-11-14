package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class PayOffPileTest {

    ArrayList<Card> cards;
    Card card1, card2, card3;
    PayOffPile payOffPile;

    @Before
    public void before() {
        cards = new ArrayList<Card>();
        card1 = new Card(Rank.JACK, Suit.SPADES);
        card2 = new Card(Rank.FOUR, Suit.SPADES);
        card3 = new Card(Rank.TWO, Suit.CLUBS);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        payOffPile = new PayOffPile(cards);

    }

    @Test
    public void canRemoveTopCard() {
        assertEquals(3, payOffPile.getPayPile().size());
        Card dummyCard = payOffPile.removeCard();
        assertEquals(Rank.TWO, dummyCard.getRank());
    }
}
