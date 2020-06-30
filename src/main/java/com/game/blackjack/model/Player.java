package com.game.blackjack.model;

import java.util.List;

public class Player {
    private Integer amount;
    private Integer total;
    private Integer alternateTotal;
    private String playerNo;
    private List<Card> cards;

    public void hit(Deck deck) {
        cards.add(deck.draw());
        updateTotals();
    }

    public Integer stand() {
        return this.total > this.alternateTotal ? this.total <= 21 ?  this.total : this.alternateTotal : this.alternateTotal;
    }

    public void updateTotals() {
        int count = 0;
        int alternateCount = 0;
        for(Card card: cards) {
            if(card.isAce) {
                alternateCount+= card.getAlternateNumber();
                count+= card.getNumber();

            } else {
                alternateCount+= card.getNumber();
                count+= card.getNumber();
            }
        }

        this.total = count;
        this.alternateTotal = count;
    }


    public void bet(Integer betAmount) {
        this.amount = this.amount - betAmount;
        if(amount < 0){
            throw new RuntimeException("cannot bet with negative amount");
        }
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(String playerNo) {
        this.playerNo = playerNo;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
