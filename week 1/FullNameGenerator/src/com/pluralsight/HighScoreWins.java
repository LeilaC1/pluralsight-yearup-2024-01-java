package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter game scores: ");
        String gameScore = userInput.nextLine().trim();

        String[] gameScoreParts = gameScore.split("[:|]");
        String home = gameScoreParts[0];
        String visitor = gameScoreParts[1];
        int score = Integer.parseInt(gameScoreParts[2]);
        int score2 = Integer.parseInt(gameScoreParts[3]);

        System.out.println();
        String winningTeam = score > score2 ? home : visitor;

        System.out.println("winning team is " + winningTeam);

    }
}
