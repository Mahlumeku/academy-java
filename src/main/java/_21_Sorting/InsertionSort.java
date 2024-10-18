package _21_Sorting;

import java.util.Arrays;

public class InsertionSort {

	static void inserationSort(int[] array) {
		int size = array.length;
		// outer loop for each index
		for (int i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;
			// inner loop to compare and swap
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int[] data = { 5, 3, -1, 7, 10, 2 };
		System.out.print("before sort:" + Arrays.toString(data));
		inserationSort(data);
		System.out.println();
		System.out.print("After sort: " + Arrays.toString(data));

	}

}
