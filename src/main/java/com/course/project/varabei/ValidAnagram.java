package com.course.project.varabei;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean anagram = Solution.isAnagram("rat", "car");
        System.out.println(anagram);
    }

    static class Solution {
        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Integer> resultMap = new HashMap<>();

            for (char c : s.toCharArray()) {
                resultMap.put(c, resultMap.getOrDefault(c, 0) + 1);
            }

            for (char c : t.toCharArray()) {
                resultMap.put(c, resultMap.getOrDefault(c, 0) - 1);
            }

            for (int count : resultMap.values()) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
