package com.bptn.course._03_flow_control._01_while_loop;

public class ForLoopStringExample {
	
    public static void main(String[] args) {
    	
        String text = "Hello World";

        // Use a for loop to iterate through the string
        for (int index = 0; index < text.length(); index++) {
            // Print the character at the current index
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        }
    }
}

