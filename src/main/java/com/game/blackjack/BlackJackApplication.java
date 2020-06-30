package com.game.blackjack;

import com.game.blackjack.core.BlackjackOperations;
import com.game.blackjack.model.Dealer;
import com.game.blackjack.model.Deck;
import com.game.blackjack.model.Player;

public class BlackJackApplication {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.init();
        Player player = new Player();
        player.setAmount(100);
        player.setPlayerNo("player-1");
        player.bet(10);
        Dealer dealer = new Dealer();
        BlackjackOperations operations = new BlackjackOperations();
        operations.run(player, dealer, deck);

    }
}
