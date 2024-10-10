package _14_ArrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
	//Create a new array list
		int counter = 1;
		
		ArrayList<String> mybooks = new ArrayList<>();
		
		mybooks.add("book1".toLowerCase());
		mybooks.add("book2");
		mybooks.add("book3");
		
	//Display all book
		System.out.println("My foverite books are:" + mybooks);
		for(String book:mybooks) {
			System.out.println("Book: "+ counter + book);
			counter++;
		}
		
	//Display the first book from the list
		
		System.out.println(mybooks.get(0));
		System.out.println(mybooks.getLast());
		System.out.println(mybooks.getFirst());
		//System.out.println(mybooks.get[1]);this has an error message
		
	//Delete the second	
		
		mybooks.remove(1);
		System.out.println(mybooks);
	//Search for a book
		if(mybooks.contains("book1")) { //we can also use .ignore case
			System.out.println("Book found");
			} else {
				System.out.println("Book not found");
			}
		//The size of the index
		
		System.out.println("THis size of the list is: " + mybooks.size());
		System.out.println(mybooks.size()-1);
	}

}
