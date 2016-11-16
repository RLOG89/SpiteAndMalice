package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class GameTest {

    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Card> cards = new ArrayList<>();
    Game game;
    Player ross = new Player("Ross", new Hand(), new PayOffPile());
    Player bobby = new Player("Bobby", new Hand(), new PayOffPile());
    Card card1 = new Card(Rank.EIGHT, Suit.DIAMONDS);
    Card card2 = new Card(Rank.ACE, Suit.DIAMONDS);

    @Before
    public void before() {
        players.add(ross);
        players.add(bobby);
        game = new Game(new CentreStack(), new Deck(3), players, 5, 20);
    }

    // 3 decks (156) - 2 piles (40) & 2 hands (10)
    @Test
    public void spiteAndMaliceDeckHasCorrectNumberOfCards() {
        assertEquals(106, (game.getSpiteAndMaliceDeck().size()));
    }

    @Test
    public void canAddPlayers() {
        assertEquals(2, game.getPlayers().size());
    }

    @Test
    public void playerStartsWithFiveCardsInHand() {
        assertEquals(5, ross.getHandSize());
        assertEquals(5, bobby.getHandSize());
    }

    @Test
    public void playerStartsWithTwentyCardsInPile() {
        assertEquals(20, ross.getPileSize());
        assertEquals(20, bobby.getPileSize());
    }

    @Test
    public void playerCannotHaveMoreThanFiveCardsInHand() {
        game.dealCardsToPlayerHand();
        assertEquals(5, ross.getHandSize());
    }

    @Test
    public void centreStackPlayCheckWorks() {
        assertEquals(false, game.centreStackValidMoveCheck(1, card1));
        assertEquals(true, game.centreStackValidMoveCheck(1, card2));
    }

    @Test
    public void canAddAllowedCardFromHandToCentreStack() {
        ross.getHand().removeCardAtIndex();
        ross.getHand().addCard(card2);
        game.addAllowedCardToCentreStack(1, card2, ross);
        assertEquals(1, game.getCentreStack().getStack(1).size() );
    }

    @Test
    public void canAddAllowedCardFromPayOffPileToCentreStack() {
        ross.getPayOffPile().removeCard();
        ross.getPayOffPile().addCard(card2);
        game.addAllowedCardToCentreStack(2, card2, ross);
        assertEquals(1, game.getCentreStack().getStack(2).size());
    }

    @Test
    public void cannotAddDisallowedCardFromHandToCentreStack() {
        game.addAllowedCardToCentreStack(1, card1, ross);
        assertEquals(0, game.getCentreStack().getStack(1).size());
    }
}
