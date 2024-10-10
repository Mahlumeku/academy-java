package Week3;

import java.util.LinkedList;

	public class Linkedlistadd {
	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> cars = new LinkedList<>();
	        
	        // Adding elements to the LinkedList
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Ford");
	        
	        // Insert element at the start
	        cars.addFirst("Mazda");
	     
	        // Insert element at the start
	        cars.addLast("Nissan");
	        
	        //Insert between two elements 
	        cars.add(3, "Toyota");
	        
	        // Remove element from LinkedList
	        cars.remove(2); // Removes "BMW"
	        
	        // Get element from LinkedList
	        System.out.println("First Element: " + cars.getFirst());
	        System.out.println("Element at Index 1: " + cars.get(1));
	        
	        // Display the LinkedList
	        System.out.println("Current LinkedList: " + cars);
	    }
	}


