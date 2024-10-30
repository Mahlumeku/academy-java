package Week5;

public class InsertionSort {
	// Static method to perform inseration sort on an integer
	public static void insertionSort(int[] arr) {

		// Check if the array is null or has no element
		if (arr == null || arr.length < 1) {
			return;// Exit the method if the array is null or empity
		}
		// Loop through each element starting from index 1
		for (int i = 1; i < arr.length; i++) {
			// Store the current element to be positioned
			int current = arr[i];
			// Initialize j to point to the last element in the element
			int j = i - 1;
			// Inner loop to comparing and shifting elements
			while (j >= 0 && current < arr[j]) {
				// Shift larger element to the right to make space for the current element
				arr[j + 1] = arr[j]; // Move element at index j to index i+1
				j--; // Move to the next element in the sorted postion
			}
			// After finding the correct postion , inseret the current element
			arr[j + 1] = current;
		}
	}

	// Do not modify below code
	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 3, 4, 1, -2, 4, 8 };
		// Call the sort method to sort the array
		insertionSort(arr);
		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
// Summary:
// This code implements the insertion sort algorithm to sort an integer array in ascending order.
// The key steps include checking for null or empty arrays, iterating through the array,
// and inserting each element into its correct position within the sorted portion.
// I had to ensure that the inner while loop correctly compared and shifted elements.
// Moving forward, I will remember the importance of clearly commenting my code for 
//better understanding and maintainability.