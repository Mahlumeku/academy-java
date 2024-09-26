package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
		        
		String command = scan.nextLine();
			
		if (command.equals("n")) {
		System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
		}
		else if (command.equals("e")) {
		System.out.println("You are now entering the beach shack!");
		 }
		 else if (command.equals("s")) {
		 System.out.println("You are now at the sea!"); 
		 }
		 else if (command.equals("W")) {
		 System.out.println("You are now headed West!");
		 }
		 // Add else-ifs for s, e, w, and an else for any other input. Be creative!
		 else {
		 System.out.println("End of adventure!");  
		  }
		  scan.close();
		}
	
	}


