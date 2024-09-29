package com.bptn.course._03_flow_control._03_if_statement;

public class InsertPosition {
    public static void main(String[] args) {
        // Example sorted array and target value
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        // Find the target index or the insertion point
        int index = searchInsert(nums, target);

        // Display the result
        System.out.println("The target index or insertion point is: " + index);
    }

    // Method to find the target index or insertion point
    public static int searchInsert(int[] nums, int target) {
        int left = 0; // Left boundary of the search range
        int right = nums.length - 1; // Right boundary of the search range

        // Use binary search to find the target or insertion point
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Check if the target is found at the middle index
            if (nums[mid] == target) {
                return mid;
            } 
            // If the target is greater, adjust the left boundary
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            // If the target is smaller, adjust the right boundary
            else {
                right = mid - 1;
            }
        }

        // If the target is not found, 'left' will be the insertion index
        return left;
    }
}
