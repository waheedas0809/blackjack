package com.game.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private Integer deckIndex;

    public void init() {
        deckIndex = 0;
        this.cards= new ArrayList<Card>();
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i=1; i<=13; i++) {
            numberList.add(new Integer(i));
        }
        for(Suit suit: Suit.values()) {
            for (Integer i : numberList) {
                Card card = new Card();
                if (i == 1) {
                    card.setAce(true);
                    card.setAlternateNumber(11);
                }
                card.setNumber(i);
                card.setAce(false);
                card.setSuit(suit);
                cards.add(card);
            }
        }        
        Collections.shuffle(cards);
    }
    public Card draw() {
        return cards.get(deckIndex++);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
