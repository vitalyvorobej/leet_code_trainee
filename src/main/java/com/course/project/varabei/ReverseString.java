package com.course.project.varabei;

public class ReverseString {
    public static void main(String[] args) {
        Solution.reverseString(new char[]{'h', 'e', 'l', 'l', 'O'});
    }

    static class Solution {
        public static void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;
            while (left < right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                right--;
                left++;
            }
        }
    }
}
