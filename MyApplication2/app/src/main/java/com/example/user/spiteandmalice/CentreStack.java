package com.example.user.spiteandmalice;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */


public class CentreStack {

    // put these in an array later //
    private ArrayList<Card> stack1 = new ArrayList<>(12);
    private ArrayList<Card> stack2 = new ArrayList<>(12);
    private ArrayList<Card> stack3 = new ArrayList<>(12);
    private ArrayList<Card> stack4 = new ArrayList<>(12);

    public CentreStack() {
    }

    public ArrayList<Card> getStack(int centreStackNumber) {
        if (centreStackNumber == 1){return stack1;}
        if (centreStackNumber == 2){return stack2;}
        if (centreStackNumber == 3){return stack3;}
        if (centreStackNumber == 4){return stack4;}
        // add throw exception here if any other number entered //
        return null;
    }

    public void addCard(int centreStackNumber, Card card) {
        if (centreStackNumber == 1){stack1.add(card);}
        if (centreStackNumber == 2){stack2.add(card);}
        if (centreStackNumber == 3){stack3.add(card);}
        if (centreStackNumber == 4){stack4.add(card);}
        // add throw exception here if any other number entered //
        else;
    }

    public void resetStack(int centreStackNumber) {
        if (centreStackNumber == 1){stack1.clear();}
        if (centreStackNumber == 2){stack2.clear();}
        if (centreStackNumber == 3){stack3.clear();}
        if (centreStackNumber == 4){stack4.clear();}
    }
}
