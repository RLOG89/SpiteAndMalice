package com.example.user.spiteandmalice;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertNull;

/**
 * Created by user on 15/11/2016.
 */

public class GameTest {

    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Card> cards = new ArrayList<>();
    Game game;
    Player ross = new Player("Ross", new Hand(), new PayOffPile(), new SideStack());
    Player bobby = new Player("Bobby", new Hand(), new PayOffPile(), new SideStack());
    Card card1 = new Card(Rank.EIGHT, Suit.DIAMONDS);
    Card card2 = new Card(Rank.ACE, Suit.DIAMONDS);

    @Rule
    public final ExpectedException exception = ExpectedException.none();

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
    public void canAddValidCardFromHandToCentreStack() {
        ross.getHand().removeCardAtIndex();
        ross.getHand().addCard(card2);
        game.moveCardFromHandToCentre(1, card2, ross);
        assertEquals(1, game.getCentreStack().getStack(1).size() );
    }

    //no longer works as added in extra check//
//    @Test
//    public void canAddValidCardFromPayOffPileToCentreStack() {
//        ross.getPayOffPile().removeCard();
//        ross.getPayOffPile().addCard(card2);
//        game.moveCardFromHandToCentre(2, card2, ross);
//        assertEquals(1, game.getCentreStack().getStack(2).size());
//    }

    @Test
    public void cannotAddInvalidCardFromHandToCentreStack() {
        game.moveCardFromHandToCentre(1, card1, ross);
        assertEquals(0, game.getCentreStack().getStack(1).size());
    }

    @Test
    public void playerPayOffPileCardsCheck() {
        PayOffPile pile = ross.getPayOffPile();
        for (int i = 0; i == 20; i-- ) {pile.removeCard();}
        assertEquals(true, game.playerHasCardInPayOffPile(ross));
    }

    @Test
    public void canMoveCardFromHand() {
        ross.getHand().removeCardAtIndex();
        ross.getHand().addCard(card2);
        game.moveCard(card2, ross.getHand(), 0);
        assertEquals(1, game.getCentreStack().getStack(0).size());
        assertFalse(ross.getHand().cards.contains(card2));
    }

    @Test
    public void canMoveCardFromPayOffPile() {
        ross.getPayOffPile().removeCard();
        ross.getPayOffPile().addCard(card2);
        game.moveCard(card2, ross.getPayOffPile(), 1);
        assertEquals(1, game.getCentreStack().getStack(1).size());
        assertNotSame(card2, ross.getPayOffPile().getPayPile().get(0));
    }

    @Test
    public void canMoveCardFromSideStack() {
        ross.getSideStack().addCard(2, card2);
        game.moveCard(card2, ross.getSideStack(), 2);
        assertEquals(1, game.getCentreStack().getStack(2).size());
        assertEquals(0, ross.getSideStack().getStack(2).size());
    }

    @Test
    public void cannotScoreWhileGameInProgress() throws Exception {
        assertEquals(false, game.isGameOver());
        exception.expect(Exception.class);
        assertEquals(null, game.getScoreForPlayer(ross));
    }

    @Test
    public void correctScore1() throws Exception {
        // Remove all PayOffPile from ross
        for (int i = 0; i < 20; i++) ross.getPayOffPile().removeCard();
        assertEquals(25, game.getScoreForPlayer(ross));
        assertEquals(0, game.getScoreForPlayer(bobby));
    }

    @Test
    public void correctScore2() throws Exception {
        for (int i = 0; i < 10; i++) bobby.getPayOffPile().removeCard();
        for (int i = 0; i < 20; i++) ross.getPayOffPile().removeCard();
        assertEquals(15, game.getScoreForPlayer(ross));
    }
}
