package com.bptn.course._03_flow_control._01_while_loop;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // The target number that needs to be guessed
        int targetNumber = 23;

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Variable to store the user's guess
        int guess = 0;
        
        // Continue looping until the user guesses the correct number
        while (guess != targetNumber) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            
            // Read the user's input
            	guess = scanner.nextInt();

            // Check if the guess is too high, too low, or correct
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a valid number between 1 and 100.");
            } else if (guess < targetNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
            }
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
