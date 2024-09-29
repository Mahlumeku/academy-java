package com.bptn.course._04_arrays;

public class FindOddPosInArray {
    public static void main(String[] args) {
        // Declare and initialize the array with five values
        int[] numbers = {5, 10, 15, 20, 25};
        
        // Print all elements of the array using a loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // Print a blank line for better readability
        System.out.println();
        
        // Apply logic to find and print values at odd index positions
        System.out.println("Values at odd index positions:");
        for (int i = 0; i < numbers.length; i++) {
            // Check if the current index is odd
            if (i % 2 != 0) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }
        }
    }
}
