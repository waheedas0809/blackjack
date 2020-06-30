package com.game.blackjack.model;

import java.util.List;

public class Dealer {
    private List<Card> cards;
    private Integer total;
    private Integer alternateTotal;

    public void hit(Deck deck) {
        if (total < 17 || alternateTotal < 17) {
            cards.add(deck.draw());
            updateTotals();
        }
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

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
