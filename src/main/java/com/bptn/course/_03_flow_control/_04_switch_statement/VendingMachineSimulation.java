package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class VendingMachineSimulation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		double price = 0;
		do {
			
			System.out.println("Please seclect a product ");
			System.out.println("1.Product A ");
			System.out.println("2.Product B ");
			System.out.println("3.Exit ");
			
			choice = scanner.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Your product is A");
		     	break;
		case 2: System.out.println("Your product is B");
		      	break;
		case 3: System.out.println("Thank you for visiting us");
				break;
		default:System.out.println("Invalid Choice!");
		
		if (price > 0){
			
			System.out.println("Sufishient money you have a change");
		}
		else 
		{
			System.out.println("insufishent money you have a change");
		}
		} 
		while (choice !=3) {
	
	System.out.printf("Your price is:" + price);
	}
	
    scanner.close();
		}
	}
}
	
		

