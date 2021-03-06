package com.example.user.spiteandmalice;

import java.util.ArrayList;

public class SideStack {

    private ArrayList<ArrayList<Card>> sideStacks = new ArrayList<ArrayList<Card>>();


    public SideStack() {
        for (int i = 0; i < 4; i++) {
            ArrayList<Card> stack = new ArrayList<>();
            sideStacks.add(stack);
        }
    }

    public ArrayList<Card> getStack(int sideStackNumber) {
            return sideStacks.get(sideStackNumber);
        }

    public void addCard(int sideStackNumber, Card card) {
        sideStacks.get(sideStackNumber).add(0, card);
    }

    public Card removeCard(int sideStackNumber) {
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

    public boolean contains(int sideStacknumber, Card card) {
        return getStack(sideStacknumber).contains(card);
    }
}
