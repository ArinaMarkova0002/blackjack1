package com.company;

/**
 * Created by student3 on 10.11.16.
 */
public class Dealer extends Computer {
    Deck deck = new Deck();
    public void deal(Player player) {
        Card current=this.deck.pop();
        player.take(current);
    }

    public Dealer() {
       this.intellect = new DealerIntellect();
    }
}
