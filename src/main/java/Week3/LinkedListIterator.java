package Week3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args) {
		// Create a LinkedList of Strings
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");

		// Get the iterator
		Iterator<String> it = cars.iterator();

		// Iterate through the LinkedList using the iterator
		System.out.println("Using Iterator:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
