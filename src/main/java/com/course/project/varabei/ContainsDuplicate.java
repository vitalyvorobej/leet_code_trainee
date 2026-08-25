package com.course.project.varabei;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        boolean b = Solution.containsDuplicate(new int[]{1, 2, 3});
        System.out.println(b);
    }

    static class Solution {
        public static boolean containsDuplicate(int[] nums) {
            Set<Integer> integerSet = new HashSet<>();
            for (int num : nums) {
                if (!integerSet.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }
}
