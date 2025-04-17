package com.pluralsight;

public class Dice {
    private int number;
    public Dice() {
        this.number = 1;
    }
    public int roll(){
        int randomNumber = (int)(Math.random() * 6) + 1;
        this.number = randomNumber;
        return this.number;
    }
}
