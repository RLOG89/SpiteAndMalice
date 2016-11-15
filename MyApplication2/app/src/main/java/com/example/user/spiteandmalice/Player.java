package com.example.user.spiteandmalice;

/**
 * Created by user on 12/11/2016.
 */

public class Player {

    private String name;
    private Hand hand;
    private PayOffPile payOffPile;
    private SideStack sideStack;
    private int currentPoints;

    public Player(String name, Hand hand, PayOffPile payOffPile, SideStack sideStack, int currentPoints ) {
        this.name = name;
        this.hand = hand;
        this.payOffPile = payOffPile;
        this.sideStack = sideStack;
        this.currentPoints = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

}
