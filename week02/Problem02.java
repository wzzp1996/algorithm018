package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 两数之和
 * @Link: https://leetcode-cn.com/problems/two-sum/description/
 * @Thinking:
 * @TimeSpaceComplexityExplain:
 */
public class Problem01 {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) {
            return new int[0];
        }
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                return new int[]{hashmap.get(target - nums[i]), i};
            }
            hashmap.put(nums[i], i);
        }
        return new int[0];
    }
}
