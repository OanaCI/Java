package com.training.playground.blackjack;

/**
 * Created by H153466 on 5/7/2017.
 */
public class CardDeck {

    Card[] cards;

    public CardDeck ( ){

        cards=new Card[52];
        int cardPos=0;

        for( int i=1;1<=13;i++){
            Card card1=new Card(i,"trefla");
            cards[cardPos]=card1;
            cardPos++;

            Card card2=new Card(i,"inima rosie");
            cards[cardPos]=card2;
            cardPos++;

            Card card3=new Card(i ,"romb");
            cards[cardPos]=card3;
            cardPos++;

            Card card4 =new Card (i,"pica");
            cards[cardPos]=card4;
            cardPos++;

        }
    }

}
