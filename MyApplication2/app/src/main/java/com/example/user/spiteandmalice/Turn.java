package com.example.user.spiteandmalice;

/**
 * Created by user on 12/11/2016.
 */

public class Turn  {

    private CentreStack centreStack;
    private SpiteAndMaliceDeck spiteAndMaliceDeck;
    private Player player;

    public Turn (CentreStack centreStack, SpiteAndMaliceDeck spiteAndMaliceDeck, Player player) {
        this.centreStack = centreStack;
        this.spiteAndMaliceDeck = spiteAndMaliceDeck;
        this.player = player;
    }

    
}
