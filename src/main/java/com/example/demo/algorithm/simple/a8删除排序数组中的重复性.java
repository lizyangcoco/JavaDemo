package com.example.demo.algorithm.simple;

/**
 * @author by lizyang @on 2021/7/29 15:31
 * @description:
 */
public class a8删除排序数组中的重复性 {

    static class Solution {
        public static int removeDuplicates(int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int fast = 1, slow = 1;
            while (fast < n) {
                if (nums[fast] != nums[fast - 1]) {
                    nums[slow] = nums[fast];
                    ++slow;
                }
                ++fast;
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5, 6, 6, 7};
        Solution.removeDuplicates(nums);
    }

}
