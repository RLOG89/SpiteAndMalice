package com.example.user.spiteandmalice;

import java.util.ArrayList;

import static com.example.user.spiteandmalice.Rank.ACE;
import static com.example.user.spiteandmalice.Rank.KING;

public class CentreStack {

    private ArrayList<ArrayList<Card>> centreStacks = new ArrayList<>();

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
        if (centreStacks.get(centreStackNumber).size() == 12) resetStack(centreStackNumber);
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
