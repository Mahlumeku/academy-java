package Week3;

import java.util.HashMap;

public class CodeChallenge {

	public static int[] CodeChallenge(int[] nums, int target) {

		// Create a HashMap to store the number and its index
		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			// Calculate the complement
			int complement = target - nums[i];

			// Check if the complement exists in the map
			if (map.containsKey(complement)) {
				// If found, return the indices of the two numbers
				return new int[] { map.get(complement), i };
			}

			// Otherwise, add the current number and its index to the map
			map.put(nums[i], i);
		}

		// If no solution is found, return an empty array (this case won't occur based
		// on the problem description)
		return new int[] {};
	}

	public static void main(String[] args) {
		// Example usage
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		// Call the twoSum method
		int[] result = CodeChallenge(nums, target);

		// Print the result
		System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
}
