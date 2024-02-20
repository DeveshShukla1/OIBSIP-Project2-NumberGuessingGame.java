package OasisInfobyte;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int tries = 0;
        
        System.out.println("Guess a number between 1 and 100.");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            tries++;

            if (guess < number) {
                System.out.println("Too low, try again.");
            } else if (guess > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations, you guessed the number in " + tries + " tries!");
            }
        }
        scanner.close();
    }
}
