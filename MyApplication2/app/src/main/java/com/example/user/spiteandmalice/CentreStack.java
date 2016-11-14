package com.example.user.spiteandmalice;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */


public class CentreStack {

    // put these in an array later //
    private ArrayList<Card> Stack1 = new ArrayList<>(12);
    private ArrayList<Card> Stack2 = new ArrayList<>(12);
    private ArrayList<Card> Stack3 = new ArrayList<>(12);
    private ArrayList<Card> Stack4 = new ArrayList<>(12);

    public CentreStack() {
    }

    public ArrayList<Card> getStack(int centreStackNumber) {
        if (centreStackNumber == 1){return Stack1;}
        if (centreStackNumber == 2){return Stack2;}
        if (centreStackNumber == 3){return Stack3;}
        if (centreStackNumber == 4){return Stack4;}
        // add throw exception here if any other number entered //
        return null;
    }

    public void addCard(int centreStackNumber, Card card) {
        if (centreStackNumber == 1){Stack1.add(card);}
        if (centreStackNumber == 2){Stack2.add(card);}
        if (centreStackNumber == 3){Stack3.add(card);}
        if (centreStackNumber == 4){Stack4.add(card);}
        // add throw exception here if any other number entered //
        else;
    }

    public void resetStack(int centreStackNumber) {
        if (centreStackNumber == 1){Stack1.clear();}
        if (centreStackNumber == 2){Stack2.clear();}
        if (centreStackNumber == 3){Stack3.clear();}
        if (centreStackNumber == 4){Stack4.clear();}
    }
}
