package com.laudropineda;

public class Main {

    public static void main(String[] args) {

        int score = 90;
        int levelCompleted = 3;
        int bonus = 50;
        calculateScore(true, 800, levelCompleted, bonus);

        score = 1000;
        levelCompleted = 12;
        bonus = 180;


        calculateScore(true, 800, levelCompleted, bonus);
    }

    //Example of method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;

    }
}
