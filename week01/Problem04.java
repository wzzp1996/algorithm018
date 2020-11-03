package com.xxx.algorithm.week1;


 /**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 合并两个有序数组
 * @Link: https://leetcode-cn.com/problems/merge-sorted-array/
 * @Thinking: 两个数组同时迭代，谁大将此元素放入长度足够长的nums1,直到其中一个数组元素为空，再将还有更小的元素的数组的所有元素直接放入nums1
 * @TimeSpaceComplexityExplain: T: O(Math.max(n,  m)) S: O(1 + 1(双指针))  
 */
public class Problem04 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 双指针，从后往前
        int len = m + n - 1;
        // 反向遍历，比较谁大谁就放入nums1 后面,并且小的数组推进
        int i = m - 1, j = n - 1;
        for (;i >= 0 && j >= 0;) {
            nums1[len--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (i >= 0) {
            nums1[len--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[len--] = nums2[j--];
        }
    }
}
