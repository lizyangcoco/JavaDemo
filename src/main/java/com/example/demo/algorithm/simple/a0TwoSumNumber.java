package com.example.demo.algorithm.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by lizyang @on 2021/6/7 15:35
 * @description:两数之和
 */
public class a0TwoSumNumber {


    /**
     * fixme :
     *  给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *  你可以按任意顺序返回答案。
     *
     * 示例 1：
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     * 示例 2：
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     *
     * 示例 3：
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     *
     * 提示：
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * 只会存在一个有效答案
     * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
     */

    /**
     * fixme 方法一：暴力枚举
     * 思路
     * 枚举数组中的每个数x，寻找数组中是否存在 target-x
     * 注意：遍历整个数组的方式寻找，target-x 时，位于 x 之前的元素都已经和x匹配过，
     * 因此不再需要进行匹配，所以只需要在x后面的元素找 target-x
     */
    class Solution1 {
        // 两数之合,暴力破解法
        public int[] twoSum(int[] nums, int target) {
            int len = nums.length;
            for (int i = 0; i < len; ++i) {
                for (int j = i + 1; j < len; ++j) {
                    if (target - nums[i] == nums[j]) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }

    /**
     * fixme 方法二：哈希表
     * 思路
     * 快速寻找数组中是否存在目标元素，
     * 创建一个哈希表，对于每一个 x 首先查询哈希表中是否存在 target-x ，然后将 x 插入到哈希表，即保证不让 x 与自己匹配
     */
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hasTable = new HashMap<Integer, Integer>(0);
            for (int i = 0; i < nums.length; ++i) {
                if (hasTable.containsKey(target - nums[i])) {
                    // 返回坐标
                    return new int[]{hasTable.get(target - nums[i]), i};
                }
                hasTable.put(nums[i], i);
            }
            return null;
        }

    }


}
