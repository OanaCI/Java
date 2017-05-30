package com.training.playground.blackjack;

/**
 * Created by H153466 on 5/7/2017.
 */
public class Card {
    int value;
    String colour;

    public Card ( int cardValue,String cardColour){
        value=cardValue;
        colour=cardColour;
    }
    public int getValue(){
        return value;
    }
    public String getColour(){
        return colour;
    }
}
