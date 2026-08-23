package com.course.project.varabei;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String s = SolutionV1.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);
    }

    static class SolutionV1 {
        public static String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            for (int i = 0; i < strs[0].length(); i++) {
                char standardChar = strs[0].charAt(i);

                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length() || strs[j].charAt(i) != standardChar) {
                        return strs[0].substring(0, i);
                    }
                }
            }

            return strs[0];
        }
    }
}
