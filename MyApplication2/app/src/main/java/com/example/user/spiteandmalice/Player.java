package com.example.user.spiteandmalice;

public class Player {

    private String name;
    private Hand hand;
    private PayOffPile payOffPile;
    private SideStack sideStack;
    private int currentPoints;

    public Player(String name, Hand hand, PayOffPile payOffPile, SideStack sideStack, int previousPoints) {
        this.name = name;
        this.hand = hand;
        this.payOffPile = payOffPile;
        this.sideStack = sideStack;
        this.currentPoints = previousPoints;
    }

    public Player(String name, Hand hand, PayOffPile payOffPile, SideStack sideStack) {
        this(name, hand, payOffPile, sideStack, 0);
    }

    public String getName() {
        return name;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public Hand getHand() {
        return hand;
    }

    public PayOffPile getPayOffPile() {
        return payOffPile;
    }

    public int getHandSize() {
        return hand.getHand().size();
    }

    public int getPileSize() {
        return payOffPile.getPayPile().size();
    }

    public SideStack getSideStack() {
        return sideStack;
    }

}
