package com.pluralsight;

import java.util.Scanner;
import java.util.Arrays;

public class TestStatsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float average = 0.0f, median = 0.0f, sum = 0.0f, highScore = 0.0f, lowScore = 0.0f;
        float[] scores = {80.0f, 81.0f, 82.0f, 83.0f, 84.0f, 85.0f, 86.0f, 87.0f, 88.0f, 89.0f};
        Arrays.sort(scores);
        for(int i = 0; i < scores.length; i++){
            sum = scores[i] + sum;
            lowScore = scores[0];

            if(scores[i] > highScore){
                highScore = scores[i];
            }
            if(scores[i] < lowScore){
                lowScore = scores[i];
            }
        }
        average = (sum / scores.length);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highScore);
        System.out.println("Lowest Score: " + lowScore);


    }
}
