package com.pluralsight.cardgame;

import java.util.Scanner;

public class PlayGame {
    //main
    public static void main(String[] args) {
        Player[] players = setPlayers();

        // deck and shuffle
        Deck deck = new Deck();
        deck.shuffle();

        // deal cards
        dealCards(deck, players);

        // play
        playGame(deck, players);

        // who is the winner
        Player winner = gameWinner(players);

        // output
        winnerOfGame(winner);
    }

    // function players
    private static Player[] setPlayers() {
        Scanner input = new Scanner(System.in);
        System.out.println("num of players: ");
        int numPlayers = input.nextInt();
        input.nextLine();
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("player " + (i + 1) + " name: ");
            String playerName = input.nextLine();
            players[i] = new Player(playerName);
        }
        return players;
    }

    // function deal cards

    private static void dealCards(Deck deck, Player[] players) {
        for (Player player : players) {
            for (int i = 0; i < 2; i++) {
                Card card = deck.deal();
                player.addToHand(card);
            }
        }
    }

    // function play

    private static void playGame(Deck deck, Player[] players) {
        for (Player player : players) {
            System.out.println(player.getName() + "'s turn:");
            player.showHand();
            while (player.getHandValue() < 21) {
                System.out.println("want a card? (y/n)");
                Scanner input2 = new Scanner(System.in);
                String input = input2.nextLine().toUpperCase();
                if (input.equalsIgnoreCase("y")) {
                    Card card = deck.deal();
                    player.addToHand(card);
                    player.showHand();
                } else if (input.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("try again");
                }
            }
        }
    }

    // function determine the winner

    private static Player gameWinner(Player[] players) {
        Player winner = null;
        int maxScore = 0;
        for (Player player : players) {
            if (player.getHandValue() <= 21 && player.getHandValue() > maxScore) {
                maxScore = player.getHandValue();
                winner = player;
            }
        }
        return winner;
    }

    // function display winner

    private static void winnerOfGame(Player winner) {
        if (winner != null) {
            System.out.println("winner is " + winner.getName() + " - score = " + winner.getHandValue());
        } else {
            System.out.println("yall suck bounda");
        }
    }
}
