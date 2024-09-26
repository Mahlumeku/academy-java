package com.bptn.course._02_scanner;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Initialize the Scanner Object
        
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter the number of elements: ");
        
        // Fetch the input from the user and store in the variable called n
        
    	int n = scanner.nextInt();
        int first = 0; // First element of Fibonacci series
        int second = 1; // Second element of Fibonacci series

        System.out.print("Fibonacci Series up to " + n + " elements: ");

        // Print the first n elements of Fibonacci series
            for (int i = 0; i < n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;

            // Fill in the missing piece of code below to print the elelments
           // Ensure n is a positive number
            if (n <= 0) {
                System.out.println("Please enter a positive number.");
            } else {
                
            	// Display the Fibonacci series
                System.out.print("Fibonacci Series: ");
     
                
            }
            
           
        }

        scanner.close();
    }
}
