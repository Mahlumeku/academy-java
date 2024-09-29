package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice; // Declare choice outside the loop
        double num1, num2, result;

        // Start a do-while loop to keep the program running until the user chooses to exit
        do {
            // Display the calculator menu
            System.out.println("\n/…Calculator Menu…/");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.println("Press 0 to exit");

            // Get user input for the choice of operation
            System.out.print("Enter your choice (0-7): ");
            choice = scanner.nextInt();

            // Use if-else statements to perform the operation based on user choice
            if (choice == 1) {
                // Addition
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);

            } else if (choice == 2) {
                // Subtraction
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);

            } else if (choice == 3) {
                // Multiplication
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);

            } else if (choice == 4) {
                // Division
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }

            } else if (choice == 5) {
                // Squaring a number
                System.out.print("Enter a number: ");
                num1 = scanner.nextDouble();
                result = num1 * num1;
                System.out.println("The square of " + num1 + " is: " + result);

            } else if (choice == 6) {
                // Finding the square root
                System.out.print("Enter a number: ");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("The square root of " + num1 + " is: " + result);
                } else {
                    System.out.println("Error: Cannot find the square root of a negative number.");
                }

            } else if (choice == 7) {
                // Finding the reciprocal
                System.out.print("Enter a number: ");
                num1 = scanner.nextDouble();
                if (num1 != 0) {
                    result = 1 / num1;
                    System.out.println("The reciprocal of " + num1 + " is: " + result);
                } else {
                    System.out.println("Error: Reciprocal of zero is not defined.");
                }

            } else if (choice == 0) {
                // Exit the program
                System.out.println("Exiting the calculator. Thank you!");
            } else {
                // Invalid choice
                System.out.println("Invalid choice. Please enter a number between 0 and 7.");
            }

        } while (choice != 0); // Continue the loop until the user chooses to exit (choice 0)

        // Close the scanner to free resources
        scanner.close();
    }
}
