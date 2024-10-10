package Week3;

import java.util.LinkedList;

public class LinkedListFor {

	
	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> cars = new LinkedList<>();
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Ford");

	        // Standard for loop
	        System.out.println("Using Standard For Loop:");
	        for (int i = 0; i < cars.size(); i++) {
	            System.out.println(cars.get(i));
	        }

	        // Enhanced for loop/for each loop
	        System.out.println("Using Enhanced For Loop:");
	        for (String car : cars) {
	            System.out.println(car);
	        }
	    }
	}


