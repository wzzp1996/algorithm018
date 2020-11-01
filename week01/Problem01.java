package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 删除排序数组中的重复项
 * @Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @Thinking: 用快指针遍历数组，用慢指针记录数组最后一个非重复元素的索引
 * @TimeSpaceComplexityExplain: T: for循环 O(n) S: slow、result O(1) + O(1)
 */
public class Problem01 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int slow = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[slow] != nums[i]) {
                // != -> 放到非重复数组的下一位
                nums[++slow] = nums[i];
            }
        }
        int result = slow + 1;
        return result;
    }
}
