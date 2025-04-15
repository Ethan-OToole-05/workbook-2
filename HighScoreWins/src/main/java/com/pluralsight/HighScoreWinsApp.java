package com.pluralsight;

import java.util.Scanner;

public class HighScoreWinsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userInput, teamOne, teamTwo;
        int scoreOne, scoreTwo;

        System.out.print("Please enter a game score (Ex: Home:Visitor|5:4): ");
        userInput = input.nextLine();
        String[] scores = userInput.split("\\|");
        String[] names = userInput.split(":");
        teamOne = names[0];
        teamTwo = names[1];
        scoreOne = Integer.parseInt(names[2]);
        scoreTwo = Integer.parseInt(names[3]);

        if(scoreOne > scoreTwo) {
            System.out.println("Winner: " + teamOne);
        } else if (scoreOne < scoreTwo) {
            System.out.println("Winner: " + teamTwo);
        } else{
            System.out.println("It's a tie!");
        }

    }
}
