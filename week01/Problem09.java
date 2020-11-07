package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 接雨水
 * @Link: https://leetcode-cn.com/problems/trapping-rain-water/submissions/
 * @Thinking: 每一个节点的盛水面积为Math.min(max(left),max(right)) - height[i]
 * @TimeSpaceComplexityExplain: 动态规划 ：2次遍历原数组获取当前元素的左右侧最大值，再进行一次遍历直接算出当前元素所能容纳的面积。T: O(n) + S: O(n)
双指针法 ：left指针元素和左侧最大值比较计算能盛水面积，right指针元素和右侧最大值比较计算能盛水面积。T: O(n) + S: O(1)
 */
public class Problem09 {
    public int trap(int[] height) {
        // 动态规划
        // if (height == null || height.length == 0) {
        //     return 0;
        // }
        // int result = 0;
        // int size = height.length;
        // int[] left_max = new int[size];
        // int[] right_max = new int[size];
        // left_max[0] = height[0];
        // for (int i = 1; i < size; i++) {
        //     left_max[i] = Math.max(height[i], left_max[i - 1]);
        // }
        // right_max[size - 1] = height[size - 1];
        // for (int i = size - 2; i >= 0; i--) {
        //     right_max[i] = Math.max(height[i], right_max[i + 1]);
        // }
        // for (int i = 1; i < size -1; i++) {
        //     result += Math.min(left_max[i], right_max[i]) - height[i];
        // }
        // return result;

        // 双指针法
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        int left_max = 0, right_max = 0;
        while(left < right){
            if (height[left] < height[right]){
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    result += (left_max - height[left]);
                }
                ++left;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    result += (right_max - height[right]);
                }
                --right;
            }
        }
        return result;
    }
}
