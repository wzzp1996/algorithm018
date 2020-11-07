package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 丑数
 * @Link: https://leetcode-cn.com/problems/chou-shu-lcof/
 * @Thinking:   如何去保证后一项只是是2 3 5 的乘积？ 如果由前面的项来相乘235而得的结果就能保证，但得取最小
 * @TimeSpaceComplexityExplain:    T:O(n) S:O(1)
 */
public class Problem07 {
    // problem
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        nums[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            // add all ugly number
            int min = Math.min(Math.min(nums[a] * 2, nums[b] * 3), nums[c] * 5);
            nums[i] = min;
            if (min == nums[a] * 2) {
                a++;
            }
            if (min == nums[b] * 3) {
                b++;
            }
            if (min == nums[c] * 5) {
                c++;
            }
        }
        return nums[n - 1];
    }
}
