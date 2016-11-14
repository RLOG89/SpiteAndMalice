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

    private ArrayList<Card> SideStack1 = new ArrayList<>();
    private ArrayList<Card> SideStack2 = new ArrayList<>();
    private ArrayList<Card> SideStack3 = new ArrayList<>();
    private ArrayList<Card> SideStack4 = new ArrayList<>();

    public SideStack() {

    }

    public ArrayList<Card> getSideStack(int sideStackNumber) {
        if (sideStackNumber == 1){return SideStack1;}
        else if (sideStackNumber == 2){return SideStack2;}
        else if (sideStackNumber == 3){return SideStack3;}
        else if (sideStackNumber == 4){return SideStack4;}
        // add throw exception here if any other number entered //
        return null;

    }

    public void AddCardToSideStack(int sideStackNumber, Card card) {
        if (sideStackNumber == 1){SideStack1.add(0, card);}
        else if (sideStackNumber ==2){SideStack2.add(0, card);}
        else if (sideStackNumber ==3){SideStack2.add(0, card);}
        else if (sideStackNumber ==4){SideStack2.add(0, card);}
        // add throw exception here if any other number entered //
    }


//    public void RemoveCardFromSideStack1(Card card) {
//        CentreStack.s.add(0);
//        SideStack1.remove(0);
//    }
}
