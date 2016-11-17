package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class PayOffPileTest {

    ArrayList<Card> cards;
    Card card1, card2, card3;
    PayOffPile payOffPile;

    @Before
    public void before() {
        cards = new ArrayList<>();
        card1 = new Card(Rank.JACK, Suit.SPADES);
        card2 = new Card(Rank.FOUR, Suit.SPADES);
        card3 = new Card(Rank.TWO, Suit.CLUBS);
        payOffPile = new PayOffPile();
        payOffPile.addCard(card1);
        payOffPile.addCard(card2);
        payOffPile.addCard(card3);

    }

    @Test
    public void canRemoveTopCard() {
        assertEquals(3, payOffPile.getPayPile().size());
        Card dummyCard = payOffPile.removeCard();
        assertEquals(Rank.JACK, dummyCard.getRank());
    }
}
