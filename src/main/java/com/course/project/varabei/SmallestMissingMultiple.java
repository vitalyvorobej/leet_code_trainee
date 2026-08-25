package com.course.project.varabei;

import java.util.HashSet;
import java.util.Set;

public class SmallestMissingMultiple {
    public static void main(String[] args) {

        int i = Solution.missingMultiple(new int[]{8, 2, 3, 4, 6}, 2);
        System.out.println(i);
    }

    static class Solution {
        public static int missingMultiple(int[] nums, int k) {
            Set<Integer> integerSet = new HashSet<>();

            for (int num : nums) {
                integerSet.add(num);
            }

            int multiple = k;
            while (integerSet.contains(multiple)) {
                multiple += k;
            }
            return multiple;

        }
    }
}
