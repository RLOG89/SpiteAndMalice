package com.example.user.spiteandmalice;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

/*
4 empty ArrayLists.  Newly added cards should go to index(0)
Cards must be removed from position 0 every time and added to CentreStack
 */

public class SideStack {

    //put these in an array later//
    CentreStack centreStack;
    private ArrayList<Card> SideStack1 = new ArrayList<>();
    private ArrayList<Card> SideStack2 = new ArrayList<>();
    private ArrayList<Card> SideStack3 = new ArrayList<>();
    private ArrayList<Card> SideStack4 = new ArrayList<>();

    public SideStack() {

    }

    public ArrayList<Card> getSideStack(int sideStackNumber) {
        if (sideStackNumber == 1){return SideStack1;}
        if (sideStackNumber == 2){return SideStack2;}
        if (sideStackNumber == 3){return SideStack3;}
        if (sideStackNumber == 4){return SideStack4;}
        // add throw exception here if any other number entered //
        return null;

    }

    public void addCardToSideStack(int sideStackNumber, Card card) {
        if (sideStackNumber == 1){SideStack1.add(0, card);}
        if (sideStackNumber ==2){SideStack2.add(0, card);}
        if (sideStackNumber ==3){SideStack3.add(0, card);}
        if (sideStackNumber ==4){SideStack4.add(0, card);}
        // add throw exception here if any other number entered //
        else ;
    }

    public void removeCardFromSideStack(int sideStackNumber, int centreStackNumber) {
        if (sideStackNumber == 1){
           Card card = SideStack1.remove(0);
            centreStack.addCard(centreStackNumber, card);
        }
        if (sideStackNumber == 2){
            Card card = SideStack2.remove(0);
            centreStack.addCard(centreStackNumber, card);
        }
        if (sideStackNumber == 3){
            Card card = SideStack3.remove(0);
            centreStack.addCard(centreStackNumber, card);
        }
        if (sideStackNumber == 4){
            Card card = SideStack4.remove(0);
            centreStack.addCard(centreStackNumber, card);
        }

    }
}
