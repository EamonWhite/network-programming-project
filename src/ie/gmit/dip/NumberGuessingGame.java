package ie.gmit.dip;

import java.util.*;

public class NumberGuessingGame {
	private static final int MAX_GUESSES = 10;
    private Scanner s;
    private int number;

    public NumberGuessingGame() { 
        s = new Scanner(System.in);
    }

    public void start() {
        System.out.println("##############################");
        System.out.println("#### Number Guessing Game ####");
        System.out.println("##############################");

        number = (int)(Math.random() * 1000); 

        boolean notGuessed = true;
        int counter = 0;

        for (counter = 0; counter < 10; notGuessed = true, counter++) {
            System.out.println("Enter a number between 1 and 1000>");

            int guess = Integer.parseInt(s.next());

            if (guess == number) {
                System.out.println("Correct! Well done");
                notGuessed = false;
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            System.out.println("You have " + (MAX_GUESSES - counter) + " tries left.");
        }

        if (notGuessed) {
            System.out.println("The correct answer was " + number);
            System.out.println("Would you like to play another game?");
        }
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame(); 
        game.start();
    }
}
