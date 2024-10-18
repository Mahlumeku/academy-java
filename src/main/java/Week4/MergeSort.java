package Week4;

import java.util.Arrays;

public class MergeSort {

	public static void main(String args[]) {
		MergeSort sort = new MergeSort();
		int[] arr = { 181, 289, 390, 121, 145, 736, 514, 212 };
		/*
		 * int[] arr1 = { 12, 11, 13, 5, 6, 7 }; int[] arr2 = {}; int[] arr3 = { 0 };
		 * int[] arr4 = { 0, -1 }; int[] arr5 = { 22, 22, 33, 1, 33, 4, 5 };
		 */
		System.out.print("Printing original array: ");
		System.out.println(Arrays.toString(arr));
		// sort array
		sort.mergeSort(arr, 0, arr.length - 1);
		System.out.print("Printing sorted array: ");
		System.out.println(Arrays.toString(arr));

		/*
		 * // // Additional tests // System.out.print("\nOriginal array 1: "); //
		 * System.out.println(Arrays.toString(arr1)); // sort.mergeSort(arr1, 0,
		 * arr1.length - 1); // System.out.print("Sorted array 1: "); //
		 * System.out.println(Arrays.toString(arr1)); // //
		 * System.out.print("\nOriginal array 2 (empty): "); //
		 * System.out.println(Arrays.toString(arr2)); // sort.mergeSort(arr2, 0,
		 * arr2.length - 1); // System.out.print("Sorted array 2 (empty): "); //
		 * System.out.println(Arrays.toString(arr2)); // //
		 * System.out.print("\nOriginal array 3 (zero): "); //
		 * System.out.println(Arrays.toString(arr3)); // sort.mergeSort(arr3, 0,
		 * arr3.length - 1); // System.out.print("Sorted array 3(zero): "); //
		 * System.out.println(Arrays.toString(arr3)); // //
		 * System.out.print("\nOriginal array 4 :"); //
		 * System.out.println(Arrays.toString(arr4)); // sort.mergeSort(arr4, 0,
		 * arr4.length - 1); // System.out.print("Sorted array 4: "); //
		 * System.out.println(Arrays.toString(arr4)); // //
		 * System.out.print("\nOriginal array 5: "); //
		 * System.out.println(Arrays.toString(arr5)); // sort.mergeSort(arr5, 0,
		 * arr5.length - 1); // System.out.print("Sorted array 5: "); //
		 * System.out.println(Arrays.toString(arr5)); //
		 */ }

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int start, int mid, int end) {
		// Calculate sizes of the two sub-arrays to be merged
		int leftSize = mid - start + 1;
		int rightSize = end - mid;

		// Create temporary arrays for left and right sub-arrays
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];

		// Copy data to temporary arrays
		for (int i = 0; i < leftSize; i++) {
			leftArray[i] = arr[start + i];
		}
		for (int j = 0; j < rightSize; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}
		// Merge the temporary arrays back into arr[]
		int i = 0, j = 0;
		int k = start;

		// Merge until we reach the end of either leftArray or rightArray
		while (i < leftSize && j < rightSize) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		// Copy remaining elements of leftArray, if any
		while (i < leftSize) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy remaining elements of rightArray, if any
		while (j < rightSize) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void mergeSort(int arr[], int start, int end) {
		if (start < end) {
			// Find the middle point
			int mid = start + (end - start) / 2;

			// Recursively call mergeSort for left and right halves
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			// Merge the sorted halves
			merge(arr, start, mid, end);
		}
	}

}
