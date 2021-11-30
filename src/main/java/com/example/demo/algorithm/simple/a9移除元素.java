package com.example.demo.algorithm.simple;

/**
 * @author by lizyang @on 2021/7/29 15:36
 * @description:
 */
public class a9移除元素 {

    static class Solution1 {
        public static int removeElement(int[] nums, int val) {
            int n = nums.length;
            int left = 0;
            for (int right = 0; right < n; right++) {
                if (nums[right] != val) {
                    nums[left] = nums[right];
                    left++;
                }
            }
            return left;
        }
    }


    static class Solution2 {
        public static int removeElement(int[] nums, int val) {
            int left = 0;
            int right = nums.length;
            while (left < right) {
                if (nums[left] == val) {
                    nums[left] = nums[right - 1];
                    right--;
                } else {
                    left++;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {

    }


}
