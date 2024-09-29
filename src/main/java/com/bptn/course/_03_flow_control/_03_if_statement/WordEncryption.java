package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a word to encrypt
        System.out.print("Enter a word to encrypt: ");
        String input = scanner.nextLine();

        // Initialize an empty string to store the encrypted word
        String encryptedWord = "";

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Shift the character by one position, wrapping around if necessary
                ch = (char) ((ch - 'a' + 1) % 26 + 'a');
            }
            // Check if the character is an uppercase letter
            else if (ch >= 'A' && ch <= 'Z') {
                // Shift the character by one position, wrapping around if necessary
                ch = (char) ((ch - 'A' + 1) % 26 + 'A');
            }

            // Non-alphabetic characters remain unchanged
            encryptedWord += ch;
        }

        // Display the encrypted word
        System.out.println("Encrypted word: " + encryptedWord);

        // Close the scanner to free resources
        scanner.close();
    }
}
