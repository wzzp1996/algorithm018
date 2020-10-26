package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 旋转数组
 */
public class Problem02 {
    public void rotate(int[] nums, int k) {
        // 方法一：开辟一个新数组，将原来数组的0 - (尾-k)放到新数组的后面，尾-k放到前面
        k = k % nums.length;
        int[] newArray = new int[k];
        System.arraycopy(nums, nums.length - k, newArray, 0, k);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(newArray, 0, nums, 0, k);
    }
}
