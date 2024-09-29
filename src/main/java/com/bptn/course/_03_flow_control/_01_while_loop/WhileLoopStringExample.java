package com.bptn.course._03_flow_control._01_while_loop;

public class WhileLoopStringExample {
	
    public static void main(String[] args) {
    	
        String text = "Hello World";
        int index = 0;

        // Use a while loop to iterate through the string
        while (index < text.length()) {
        	            // Print the character at the current index
            System.out.println("Character at index " + index + ": " + text.charAt(index));
            
            // Increment the index to move to the next character
            index++;
        }
    }
}
