package com.xxx.algorithm.week1;

 /**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 移动零
 * @Link: https://leetcode-cn.com/problems/move-zeroes/
 * @Thinking: 双指针，快指针在数组中的值不为0，那就将该位置元素和慢指针位置的元素交换位置，最终所有为0的元素都被交换到了最后的位置
 * @TimeSpaceComplexityExplain: T: O(n) S: O(1 + 1)
 */
public class Problem06 {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            // i 快指针, j 慢指针.前面所有元素非0后面都是0
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
