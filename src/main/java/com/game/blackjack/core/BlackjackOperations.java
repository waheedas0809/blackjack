package com.game.blackjack.core;

import com.game.blackjack.model.Dealer;
import com.game.blackjack.model.Deck;
import com.game.blackjack.model.Player;

public class BlackjackOperations {

    public void run(Player player, Dealer dealer, Deck deck) {
        deal(deck, player, dealer);
        while (player.stand() < 21 && dealer.stand() < 21) {
            player.hit(deck);
            dealer.hit(deck);
        }
    }


    public void deal(Deck deck, Player player, Dealer dealer) {
        player.hit(deck);
        player.hit(deck);
        dealer.hit(deck);
        dealer.hit(deck);
    }


}
