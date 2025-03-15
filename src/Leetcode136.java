// 136. Single Number

import java.util.*;

class Leetcode136 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num); // Remove if already exists
            } else {
                set.add(num); // Add if it's the first time
            }
        }

        // The set will contain only one element, which is our answer.
        return set.iterator().next();
    }

    public static void main(String[] args) {
        Leetcode136 lt = new Leetcode136();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(lt.singleNumber(nums)); // Output: 4
    }
}
