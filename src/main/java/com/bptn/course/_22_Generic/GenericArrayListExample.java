package com.bptn.course._22_Generic;

import java.util.ArrayList;

public class GenericArrayListExample {
	public static void main(String[] args) {
		// Create an ArrayList of Integer type and populate it
		ArrayList<Integer> intNumbers = new ArrayList<>();
		intNumbers.add(10);
		intNumbers.add(20);
		intNumbers.add(30);

		// Sum of Integers
		int intSum = (int) sum(intNumbers);
		System.out.println("Sum of Integers: " + intSum);

		// Create an ArrayList of Double type and populate it
		ArrayList<Double> doubleNumbers = new ArrayList<>();
		doubleNumbers.add(10.5);
		doubleNumbers.add(20.5);
		doubleNumbers.add(30.0);

		// Sum of Doubles
		double doubleSum = sum(doubleNumbers);
		System.out.println("Sum of Doubles: " + doubleSum);
	}

	// Generic method to sum numbers from the ArrayList
	public static <T extends Number> double sum(ArrayList<T> numbers) {
		double total = 0.0;
		for (T num : numbers) {
			total += num.doubleValue();
		}
		return total;
	}
}
