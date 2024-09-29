package com.bptn.course._03_flow_control._01_while_loop;

import java.util.Scanner;

public class PluralForm {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine();

        // Prompt user to enter a singular noun
        System.out.print("Enter a singular noun: ");
        String noun = scanner.nextLine();

        // Determine the plural form based on the input number
        String pluralNoun;
        if (number == 1) {
            pluralNoun = noun; // Singular form remains unchanged
        } else if (noun.endsWith("fe")) {
            pluralNoun = noun.substring(0, noun.length() - 2) + "ves"; // Change "fe" to "ves"
        } else if (noun.endsWith("y") && !isVowel(noun.charAt(noun.length() - 2))) {
            pluralNoun = noun.substring(0, noun.length() - 1) + "ies"; // Change "y" to "ies" if preceded by a consonant
        } else if (noun.endsWith("sh") || noun.endsWith("ch")) {
            pluralNoun = noun + "es"; // Add "es" for nouns ending in "sh" or "ch"
        } else if (noun.endsWith("us")) {
            pluralNoun = noun.substring(0, noun.length() - 2) + "i"; // Change "us" to "i"
        } else {
            pluralNoun = noun + "s"; // General case: add "s"
        }

        // Display the result
        System.out.println(number + " " + pluralNoun);

        // Close the scanner
        scanner.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
