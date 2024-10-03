package ru.luckyskeet.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeAlgorithmSolver {

    //O(n squared)
    public int[] getTwoSumONSquared(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    // O(n)
    public int[] getTwoSumON(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
