package com.example.user.spiteandmalice;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */


public class CentreStack {

    private ArrayList<Card> Stack1 = new ArrayList<>(13);
    private ArrayList<Card> Stack2 = new ArrayList<>(13);
    private ArrayList<Card> Stack3 = new ArrayList<>(13);
    private ArrayList<Card> Stack4 = new ArrayList<>(13);

    public CentreStack() {

    }

    public ArrayList<Card> getStack(int centreStackNumber) {
       if (centreStackNumber == 1)
        return Stack1;
        else if (centreStackNumber == 2)
           return Stack2;
        else if (centreStackNumber == 3)
           return Stack3;
        else if (centreStackNumber == 4)
           return Stack4;
        // add throw exception here if any other number entered //
        return null;
    }

    public void stack1AddCardFromSide(Card card) {
        Stack1.add(card);
    }

    public void stack2AddCardFromSide(Card card) {
        Stack1.add(card);
    }

    public void stack3AddCardFromSide(Card card) {
        Stack1.add(card);
    }

    public void stack4AddCardFromSide(Card card) {
        Stack1.add(card);
    }
}
