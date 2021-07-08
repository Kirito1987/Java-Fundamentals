package com.laudropineda;

public class Main {

    public static void main(String[] args) {
        //Operator, operand and expression examples
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("result is: " + result);
        int previousResult = result;
        System.out.println(previousResult);

        result = result *30;
        System.out.println(result);
        result = result / 2;
        System.out.println(result);

        //if-else statement examples
        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scare of aliens");
        }

        int topScore = 90;
        if (topScore < 100) {
            System.out.println("You got the high score!!");
        }

        //AND operator = &&
        int secondTopScore = 100;
        if((topScore > secondTopScore) && (topScore <100)){
            System.out.println("Greater than second top score and less than 100");
        }

        //OR operator = ||
        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }

        //Assignment and equal to Operators
        int newValue = 51;
        if (newValue == 50) {
            System.out.println("newValue equals: " +newValue);
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
    }
}
