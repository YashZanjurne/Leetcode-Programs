// Tow sum....

import java.util.Arrays;

class Leetcode1{
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return indices of the two numbers
                }
            }
        }
        return new int[]{}; // Return empty array if no solution found
    }

    public static void main(String[] args) {
        Leetcode1 lt1 = new Leetcode1(); // Create an instance of the Solution class
        int[] nums = {2, 7, 11, 15};  // Example array
        int target = 9;  // Target sum

        int[] result = lt1.twoSum(nums, target); // Call the function

        // Print the result
        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }
}
