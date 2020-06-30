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
        Suit suit = Suit.Hearts;
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i=1; i<=52; i++) {
            numberList.add(new Integer(i));
        }
        Collections.shuffle(numberList);
        for (Integer i : numberList) {
            Card card = new Card();
            if (i % 11 == 0) {
                card.setAce(true);
                card.setAlternateNumber(1);
                suit = Suit.values()[(suit.ordinal() +1)];
            }
            card.setAlternateNumber(i);
            card.setAce(false);
            card.setSuit(suit);
            cards.add(card);
        }
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
