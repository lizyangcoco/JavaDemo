package com.example.demo.algorithm.simple;

/**
 * @author by lizyang @on 2021/7/20 16:52
 * @description:
 */
public class a4最长公共前缀 {

    /**
     * 横向比较
     */
    static class Solution {

        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            // 获取第一个字符串
            String prefix = strs[0];
            int count = strs.length;

            // 依次循环比较两个字符串
            for (int i = 1; i < count; i++) {
                prefix = longestCommonPrefix(prefix, strs[i]);
                if (prefix.length() == 0) {
                    break;
                }
            }
            return prefix;
        }

        // 比较两个字符串，获取相同的字符串
        public static String longestCommonPrefix(String str1, String str2) {
            // 获取最段路径
            int length = Math.min(str1.length(), str2.length());
            int index = 0;
            while (index < length && str1.charAt(index) == str2.charAt(index)) {
                index++;
            }
            return str1.substring(0, index);
        }

        public static void main(String[] args) {
            String[] str = {"abscdk", "cbsde", "accs"};
            longestCommonPrefix(str);
        }
    }

    /**
     * 纵向比较
     */
    class Solution1 {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            // 获取第一个字符串长度
            int length = strs[0].length();
            int count = strs.length;

            for (int i = 0; i < length; i++) {
                char c = strs[0].charAt(i);

                for (int j = 1; j < count; j++) {
                    if (i == strs[j].length() || strs[j].charAt(i) != c) {
                        return strs[0].substring(0, i);
                    }
                }

            }
            return strs[0];
        }
    }




}
