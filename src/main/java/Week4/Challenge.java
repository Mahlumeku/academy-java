package Week4;

import java.util.Arrays;

public class Challenge {

	public void Start() {

		// int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		// int x = 1;
		// Arrays.sort(array);
		// sort array
		// int result = binarySearch(array, x);
		// Print values in array after sort
		// System.out.println(result);

		// Array list based on the example
		int[] arr = { 10, 20, 30, 50, 60, 80, 110, 130, 140, 170 };
		// Sorting the array /To have a sorted array before we begin our search
		Arrays.sort(arr);
		// Example to search for x = 110
		int x = 110;
		// Perform binary search
		int result = binarySearch(arr, x);
		// Print the result
		if (result == -1) {
			System.out.println("Element " + x + " not present in the array.");
		} else {
			System.out.println("Element " + x + " found at index " + result + ".");
		}
		// Example where the element is not present
		x = 175;
		result = binarySearch(arr, x);
		if (result == -1) {
			System.out.println("Element " + x + " not present in the array.");
		} else {
			System.out.println("Element " + x + " found at index " + result + ".");
		}

	}

	int binarySearch(int arr[], int x) {
		// put your code here.
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			// Calculate the middle index
			int mid = (low + high) / 2;
			// Check if key is present at mid
			if (arr[mid] == x) {
				return mid;
			}
			// If key is greater, ignore the left half
			if (arr[mid] < x) {
				low = mid + 1;
			}
			// If key is smaller ignore the right half
			if (arr[mid] > x) {
				high = mid - 1;
			}
		}
		// Element not present in the array
		return -1;
	}

	public static void main(String[] args) {
		Challenge main = new Challenge();
		main.Start();
	}
}