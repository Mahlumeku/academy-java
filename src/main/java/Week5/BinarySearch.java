package Week5;

import java.util.Arrays;

public class BinarySearch {

	// Method to perform binary search on an unsorted integer array
	public static int binarySearch(int[] arr, int key) {
		// Sort the array to ensure it is sorted before applying binary search
		Arrays.sort(arr);

		// Initialize pointers for the start and end of the array
		int low = 0;
		int high = arr.length - 1;

		// Binary search loop continues until low is less than equal to high
		while (low <= high) {
			// Calculate the middle index of the current search range
			int mid = (low + high) / 2;
			// Check if the key is at the middle index
			if (arr[mid] == key) {
				return mid; // Return the index if key is found
			}
			// If the key is greater than the middle element, search the right half
			else if (arr[mid] < key) {
				low = mid + 1;// Move low pointer to mid +1

			}
			// If the key is smaller than the middle element,search the left
			else {
				high = mid - 1; // Move high pointer to mid -1
			}
		}

		// If the key is not found, return -1
		return -1;// return -1 if the key is not found in the array
	}

	// Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}
/*
 * Summary: In this code, I implemented a binary search algorithm within a class
 * named BinarySearch. The task involved sorting an unsorted array using
 * `Arrays.sort()` before performing the binary search to ensure accurate
 * searching. By using two pointers (`low` and `high`), I was able to
 * efficiently search for the key by halving the search range at each step.
 * 
 * One of the new aspects of this task was the need to sort the array before
 * applying binary search since binary search only works on sorted data. This
 * highlighted the importance of preparing the data before running algorithms
 * that rely on specific conditions.
 * 
 * One thing I understand that the input array must be sorted first. Without
 * sorting, the binary search could produce incorrect results. I will remember
 * to always check preconditions for algorithms, such as sorting an array before
 * performing binary search, to ensure they function correctly. This lesson
 * reinforced the importance of data preparation before applying certain
 * algorithms.
 */