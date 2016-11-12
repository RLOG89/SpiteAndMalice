package com.example.user.spiteandmalice;

/**
 * Created by user on 12/11/2016.
 */

public class Player {

    private String name;
    private Hand hand;
    private Scoring score;

    public Player(String name, Hand hand, Scoring score ) {
        this.name = name;
        this.hand = hand;
        this.score = score;
    }

    public String getName() {
        return name;
    }
}
