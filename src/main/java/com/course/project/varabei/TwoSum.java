package com.course.project.varabei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        SolutionV2 solution = new SolutionV2();
        int[] ints = solution.twoSum(new int[]{2, 5, 5, 11}, 10);
        System.out.println(Arrays.toString(ints));
    }
}

//o(n2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int currentNum = 0;
        int nextNum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                currentNum = nums[i];
                nextNum = nums[j];
                if (currentNum + nextNum == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}

//o(1)
class SolutionV2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}