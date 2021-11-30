package com.example.demo.algorithm.simple;

import java.math.BigDecimal;

/**
 * @author by lizyang @on 2021/8/11 11:04
 * @description:
 */
public class b1搜索插入位置 {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *
     * 请必须使用时间复杂度为 O(log n) 的算法。
     *
     *
     *
     * 示例 1:
     *
     * 输入: nums = [1,3,5,6], target = 5
     * 输出: 2
     * 示例 2:
     *
     * 输入: nums = [1,3,5,6], target = 2
     * 输出: 1
     * 示例 3:
     *
     * 输入: nums = [1,3,5,6], target = 7
     * 输出: 4
     * 示例 4:
     *
     * 输入: nums = [1,3,5,6], target = 0
     * 输出: 0
     * 示例 5:
     *
     * 输入: nums = [1], target = 0
     * 输出: 0
     */

    /**
     * 二分法查找
     */
    static class Solution {
        public static int searchInsert(int[] nums, int target) {

            int n = nums.length;
            // 起始位，结束位，长度
            int left = 0, right = n - 1, ans = n;
            // 起始位<=结束位

            while (left <= right) {
                int mid = ((right - left) >> 1) + left;
                // 目标<=中位数，长度减半，并向结束位-1
                if (target <= nums[mid]) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    // 目标>中位数，中位数+1，重新计算
                    left = mid + 1;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        int searchInsert = Solution.searchInsert(new int[]{1, 2, 3, 4, 6}, 3);
        System.out.println(searchInsert);


    }


}
