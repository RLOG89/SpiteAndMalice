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

    public ArrayList<Card> getStack(int stackNumber) {
        return Stack1;
    }

    public ArrayList<Card> getStack2() {
        return Stack2;
    }

    public ArrayList<Card> getStack3() {
        return Stack3;
    }

    public ArrayList<Card> getStack4() {
        return Stack4;
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
