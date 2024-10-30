package Week5;

import java.util.ArrayList;
import java.util.List;

public class Product {
	// Create your instance variables
	private int id;
	private String name;
	private double price;

	// Create a constructor to initialize the product properties
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Create a static method "countProducts"
	public static long countProducts(List<Product> productsList) {
		long count = productsList.stream().filter(p -> p.price < 30000).count();
		return count;
	}

	// Filter products based on the price and get the count of products
	public static void main(String[] args) {
		// Create a list of products
		List<Product> productsList = new ArrayList<Product>();
		// Add products to the list
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));
		// Call "countProducts" method and hold return type in "count" variable
		long count = countProducts(productsList);
		// Print the count of products whose price is less than 30000
		System.out.println("Number of products with price less than 30000: " + count);
	}
}

// Summary:
// This code implements a Java program to count the number of Product objects with a price less than 30000
// using the Java Stream API. The key steps include defining the Product class with its attributes and constructor,
// and utilizing a static method to filter and count products based on their price. 
// I encountered some issues understanding the lambda expressions with stream I refred back to the learning materials 
//to understand well and implement in this code.
// the use of the filter method. Moving forward, I will remember the benefits of using the Stream API for operations on collections, 
//which can make the code more concise and readable.