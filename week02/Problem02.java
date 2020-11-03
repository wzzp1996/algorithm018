package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 两数之和
 * @Link: https://leetcode-cn.com/problems/two-sum/description/
 * @Thinking: hash法解题，迭代数组和数组存入hashmap同时进行，for 循环里面每次都会和hashmap里面存入的值比较。hashmap的key是数组元素，value是数组的索引，便于匹配到结果之后直接返回。
 * @TimeSpaceComplexityExplain: T: O(n + n * 1(hashmap)) S: O(n)
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
