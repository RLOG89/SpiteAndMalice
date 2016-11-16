package com.example.user.spiteandmalice;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.example.user.spiteandmalice.Rank.ACE;
import static com.example.user.spiteandmalice.Rank.KING;

/**
 * Created by user on 12/11/2016.
 */


public class CentreStack {

    private ArrayList<ArrayList<Card>> centreStacks = new ArrayList<ArrayList<Card>>();

    public CentreStack() {
        for (int i = 0; i < 4; i++) {
            ArrayList<Card> stack = new ArrayList<>(12);
            centreStacks.add(stack);
        }
    }

    public ArrayList<Card> getStack(int centreStackNumber) {
        return centreStacks.get(centreStackNumber);
    }

    public void addCard(int centreStackNumber, Card card) {
        if (getStack(centreStackNumber).size() == 0 && !card.getRank().equals(ACE)) return;
        if (card.getRank().equals(KING)) {
            centreStacks.get(centreStackNumber).add(card);
            return;
        }
        if (card.getValue() == getStack(centreStackNumber).size() + 1) {
            centreStacks.get(centreStackNumber).add(card);
        }
    }

    public void resetStack(int centreStackNumber) {
        centreStacks.get(centreStackNumber).clear();
    }
}
