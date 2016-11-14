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

    //put these in an array later//
    private ArrayList<Card> sideStack1 = new ArrayList<>();
    private ArrayList<Card> sideStack2 = new ArrayList<>();
    private ArrayList<Card> sideStack3 = new ArrayList<>();
    private ArrayList<Card> sideStack4 = new ArrayList<>();

    public SideStack() {
    }

    public ArrayList<Card> getSideStack(int sideStackNumber) {
        if (sideStackNumber == 1){return sideStack1;}
        if (sideStackNumber == 2){return sideStack2;}
        if (sideStackNumber == 3){return sideStack3;}
        if (sideStackNumber == 4){return sideStack4;}
        // add throw exception here if any other number entered //
        return null;
    }

    public void addCardToSideStack(int sideStackNumber, Card card) {
        if (sideStackNumber == 1){sideStack1.add(0, card);}
        if (sideStackNumber == 2){sideStack2.add(0, card);}
        if (sideStackNumber == 3){sideStack3.add(0, card);}
        if (sideStackNumber == 4){sideStack4.add(0, card);}
        // add throw exception here if any other number entered //
        else ;
    }

    // add second part of this to game rather than here //

//    public void removeCardFromSideStack(int sideStackNumber, int centreStackNumber) {
//        if (sideStackNumber == 1){
//           Card card = SideStack1.remove(0);
//            centreStack.addCard(centreStackNumber, card);
//        }
//        if (sideStackNumber == 2){
//            Card card = SideStack2.remove(0);
//            centreStack.addCard(centreStackNumber, card);
//        }
//        if (sideStackNumber == 3){
//            Card card = SideStack3.remove(0);
//            centreStack.addCard(centreStackNumber, card);
//        }
//        if (sideStackNumber == 4){
//            Card card = SideStack4.remove(0);
//            centreStack.addCard(centreStackNumber, card);
//        }
//    }

    public Card removeCardFromSideStack(int sideStackNumber) {
        if (sideStackNumber == 1) {
            Card card = sideStack1.remove(0);
            return card;
        }
        else if (sideStackNumber == 2) {
            Card card = sideStack2.remove(0);
            return card;
        }
        else if (sideStackNumber == 3) {
            Card card = sideStack3.remove(0);
            return card;
        }
        else if (sideStackNumber == 4) {
            Card card = sideStack4.remove(0);
            return card;
        }
        // add throw exception here if any other number entered //
        else return null;
    }
}
