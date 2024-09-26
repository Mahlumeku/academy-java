package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class CountToZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Call the method to calculate steps
        int steps = countStepsToZero(num);
        
        // Print the result
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
        
        // Close the scanner
        scanner.close();
    }

    // Method to count steps to reduce num to zero
    public static int countStepsToZero(int num) {
        int steps = 0; // Initialize step counter
        
        // Continue until num is reduced to zero
        while (num > 0) {
            if (num % 2 == 0) {
                // If num is even, divide it by 2
                num /= 2;
            } else {
                // If num is odd, subtract 1
                num -= 1;
            }
            steps++; // Increment the step counter
        }
        
        return steps; // Return the total number of steps
    }
}