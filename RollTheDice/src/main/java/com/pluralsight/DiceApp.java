package com.pluralsight;

import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  roll1, roll2, sum, twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        roll1 = dice1.roll();
        roll2 = dice2.roll();

        sum = roll1 + roll2;

        for (int i = 1; i < 101; i++){
            sum = 0;
            roll1 = dice1.roll();
            roll2 = dice2.roll();
            sum = roll1 + roll2;
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);
            switch (sum) {
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
            }

        }
        System.out.println("Twos: " + twoCounter + " Fours: " + fourCounter + " Sixes: " + sixCounter + " Sevens: " + sevenCounter);

    }
}
