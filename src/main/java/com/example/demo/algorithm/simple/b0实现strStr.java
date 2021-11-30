package com.example.demo.algorithm.simple;

/**
 * @author by lizyang @on 2021/8/11 9:59
 * @description:
 */
public class b0实现strStr {

    /**
     * 输入：haystack="hello"  needle="ll";
     * 输出：2
     * 找出后者字符串出现的第一个位置
     */
    static class Solution {
        public static int strStr(String haystack, String needle) {
            int n = haystack.length(), m = needle.length();

            for (int i = 0; i + m <= n; i++) {
                boolean flag = true;

                // m中的元素 依次和n中比较，只要后续一项不相等，便false，进行下一位匹配
                for (int j = 0; j < m; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
            // 当m大于n，或没有查找到元素，直接返回
            return -1;
        }
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "hel";
        Solution.strStr(haystack, needle);
        System.out.println(Solution.strStr(haystack, needle));
    }
}
