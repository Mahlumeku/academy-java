package Week5;

//import the required classes
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	// Method that returns the indices of two elements in the nums array that add up
	// to the target value
	public int[] twoSum(int[] nums, int target) {
		// Initialize a HashMap to store the value of each element in the nums array and
		// its index
		Map<Integer, Integer> map = new HashMap<>();

		// Loop through each element in the nums array
		for (int i = 0; i < nums.length; i++) {
			// Calculate the complement, which is the difference between the target and the
			// current element
			int complement = target - nums[i];

			// Check if the complement is found in the HashMap
			if (map.containsKey(complement)) {
				/*
				 * If the complement is found, return the index of the complement and the
				 * current index because these two indices correspond to two elements that add
				 * up to the target
				 */
				return new int[] { map.get(complement), i };
			}
			// If the complement is not found, put the current element and its index into
			// the HashMap
			map.put(nums[i], i);
		}

		// If no two sum solution is found, throw an IllegalArgumentException
		throw new IllegalArgumentException("No two sum solution");
	}

	// Do not modify the code below:
	// Main method to test the twoSum method
	public static void main(String[] args) {
		// Example array of integers
		int[] nums = { 2, 7, 11, 15 };

		// Example target value
		int target = 9;

		// Create a TwoSum object
		TwoSum solution = new TwoSum();

		// Call the twoSum method to get the indices of the two elements that add up to
		// the target value
		int[] indices = solution.twoSum(nums, target);

		// Print the result
		System.out.println("The indices are: " + indices[0] + " and " + indices[1]);
	}
}
//Summary:
//This code implements a solution to the Two Sum problem, where we find two indices 
//of elements in an integer array that add up to a specified target. 
//I utilized a HashMap to store each number and its corresponding index 
//for efficient lookups, which allows for a time complexity of O(n).
//This was my first time using a HashMap for solving this kind of problem, 
//which greatly improved efficiency compared to a nested loop approach. 
//In the future, I'll remember the utility of HashMaps for problems involving 
//finding pairs or complements within collections, and I'll focus on 
//writing clean and efficient code to enhance performance.