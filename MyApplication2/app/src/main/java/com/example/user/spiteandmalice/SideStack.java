package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

/*
4 empty ArrayLists.  Newly added cards should go to index(0)
Cards must be removed from position 0 only, and added to CentreStack
 */

public class SideStack {

    private ArrayList<ArrayList<Card>> sideStacks = new ArrayList<ArrayList<Card>>();


    public SideStack() {
        for (int i = 0; i < 4; i++) {
            ArrayList<Card> stack = new ArrayList<>();
            sideStacks.add(stack);
        }
    }

    public ArrayList<Card> getSideStack(int sideStackNumber) {
            return sideStacks.get(sideStackNumber);
        }

    public void addCardToSideStack(int sideStackNumber, Card card) {
        sideStacks.get(sideStackNumber).add(card);
    }

    public Card removeCardFromSideStack(int sideStackNumber) {
        return sideStacks.get(sideStackNumber).remove(0);
    }

//        if (sideStackNumber == 1) {
//            Card card = sideStack1.remove(0);
//            return card;
//        }
//        else if (sideStackNumber == 2) {
//            Card card = sideStack2.remove(0);
//            return card;
//        }
//        else if (sideStackNumber == 3) {
//            Card card = sideStack3.remove(0);
//            return card;
//        }
//        else if (sideStackNumber == 4) {
//            Card card = sideStack4.remove(0);
//            return card;
//        }
//        // add throw exception here if any other number entered //
//        else return null;
//    }
}
