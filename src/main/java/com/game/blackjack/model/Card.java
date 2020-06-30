package com.game.blackjack.model;

public class Card {
    private Suit suit;
    private Integer number;
    private Integer alternateNumber;
    boolean isAce; // we use alternate number

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(Integer alternateNumber) {
        this.alternateNumber = alternateNumber;
    }

    public boolean isAce() {
        return isAce;
    }

    public void setAce(boolean ace) {
        isAce = ace;
    }
}
