package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 旋转数组
 * @Link: https://leetcode-cn.com/problems/rotate-array/
 * @Thinking: 将数组中的元素都移动k个位置，那新元素所在数组位置就为 索引 + k
 *            由于数组空间没有扩大，就只能将超出原数组大小的元素放入数组开头位置
 *            由于k的值可能超过数组的容量，且数组移动k和移动k%nums,length的结果相同
 *            所以移动首部元素k个位置，并将超出边界的元素(k个)直接放回原数组的头部即可
 * @TimeSpaceComplexityExplain: T: O(n+k) S: O(k) 待jvm源码分析确认
 */
public class Problem02 {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k %= nums.length;
        int[] temp = new int[k];
        // 将尾部元素临时暂存
        System.arraycopy(nums, nums.length - k, temp, 0, k);
        // 移动首部元素
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        // 尾部元素放回数组
        System.arraycopy(temp, 0, nums, 0, k);
    }
}
