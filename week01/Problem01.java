package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 删除排序数组中的重复项
 */
public class Problem01 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int effective = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[effective] != nums[i]) {
                nums[++effective] = nums[i];
            }
        }
        return effective + 1;
    }
}
