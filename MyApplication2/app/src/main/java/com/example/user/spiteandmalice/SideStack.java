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

    private ArrayList<Card> SidePileCards1;
    private ArrayList<Card> SidePileCards2;
    private ArrayList<Card> SidePileCards3;
    private ArrayList<Card> SidePileCards4;

    public SideStack() {

    }

    public void AddCardToSidePileCards1(Card card) {
        SidePileCards1.add(0, card);
    }

    public void AddCardToSidePileCards2(Card card) {
        SidePileCards2.add(0, card);
    }

    public void AddCardToSidePileCards3(Card card) {
        SidePileCards3.add(0, card);
    }

    public void AddCardToSidePileCards4(Card card) {
        SidePileCards4.add(0, card);
    }
}
