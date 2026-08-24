package com.course.project.varabei;

public class ValidPalindrome {
    public static void main(String[] args) {
        boolean result = Solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }

    static class Solution {

        static boolean isPalindrome(String s) {
            s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
            return true;
        }

    }


    static class SolutionV2 {
        static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                while (left < right && !(Character.isLetterOrDigit(s.charAt(left)))) {
                    left++;
                }
                while (left < right && !(Character.isLetterOrDigit(s.charAt(right)))) {
                    right--;
                }

                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
