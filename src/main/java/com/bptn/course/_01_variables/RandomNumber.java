package com.bptn.course._01_variables;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

      // Create an instance of the Random class
        Random random = new Random();
        
                  
       // Define the range for the random number
        int min = 1; // inclusive
        int max = 100; // exclusive

       // Generate a random number between min (inclusive) and max (exclusive)
        int randomNumber = random.nextInt(max - min) + min;
    
        // Print the generated random number
        System.out.println("After excution the random number is: " + randomNumber);
    }
        
    }