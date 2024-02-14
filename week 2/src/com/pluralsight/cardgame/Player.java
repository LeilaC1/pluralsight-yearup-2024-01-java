package com.pluralsight.cardgame;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand(name);
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void addToHand(Card card) {
        hand.deal(card);
    }

    public int getHandSize() {
        return hand.getSize();
    }

    public int getHandValue() {
        return hand.getValue();
    }

    public void showHand() {
        hand.showHand();
    }
}
