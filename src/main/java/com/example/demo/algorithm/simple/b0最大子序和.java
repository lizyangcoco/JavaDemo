package com.example.demo.algorithm.simple;

/**
 * @author by lizyang @on 2021/8/11 17:52
 * @description:
 */
public class b0最大子序和 {


    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
     * 示例 2：
     * <p>
     * 输入：nums = [1]
     * 输出：1
     * 示例 3：
     * <p>
     * 输入：nums = [0]
     * 输出：0
     * 示例 4：
     * <p>
     * 输入：nums = [-1]
     * 输出：-1
     * 示例 5：
     * <p>
     * 输入：nums = [-100000]
     * 输出：-100000
     */
    static class Solution {
        public static int maxSubArray(int[] nums) {
            int pre = 0, maxAns = nums[0];
            for (int x : nums) {

                pre = Math.max(pre + x, x);
                maxAns = Math.max(maxAns, pre);
            }
            return maxAns;
        }
    }

    public static void main(String[] args) {
        int maxSubArray = Solution.maxSubArray(new int[]{-1, 2, -3, 4, -1, 10});
        System.out.println(maxSubArray);
    }
}
