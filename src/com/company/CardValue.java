package com.company;

/**
 * Created by mbila on 4/21/15.
 */
public enum CardValue {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int cardValue;
    private int cardNum;

    CardValue() {
        //constructor
    }

    public CardValue getCardValue(int cardNum) {
        CardValue card = CardValue.valueOf(Integer.toString(cardNum));
        return card;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
