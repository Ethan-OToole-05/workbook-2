package com.pluralsight;

import java.util.Scanner;

public class HighScoreWinsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userInput, teamOne, teamTwo;
        int scoreOne, scoreTwo;

        System.out.print("Please enter a game score (Ex: Home:Visitor|5:4): ");
        userInput = input.nextLine();
        //Split input into two parts one for names and the other for scores.
        String[] inputParts = userInput.split("\\|");

        //Split the inputParts now by name and scores.
        String[] teamNames = inputParts[0].split(":");
        String[] scores = inputParts[1].split(":");

        //Assign those values for teamName and scores.
        teamOne = teamNames[0];
        teamTwo = teamNames[1];
        scoreOne = Integer.parseInt(scores[0]);
        scoreTwo = Integer.parseInt(scores[1]);

        //Compare to see who is the winner or if there is a tie.
        if(scoreOne > scoreTwo) {
            System.out.println("Winner: " + teamOne);
        } else if (scoreOne < scoreTwo) {
            System.out.println("Winner: " + teamTwo);
        } else{
            System.out.println("It's a tie!");
        }

    }
}
