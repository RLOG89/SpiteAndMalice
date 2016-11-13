package com.example.user.spiteandmalice;

/**
 * Created by user on 12/11/2016.
 */

public class Player {

    private String name;
    private Hand hand;
    private int currentPoints;

    public Player(String name, Hand hand, int currentPoints ) {
        this.name = name;
        this.hand = hand;
        this.currentPoints = 0;
    }

    public String getName() {
        return name;
    }
}
