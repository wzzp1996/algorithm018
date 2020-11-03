package com.xxx.algorithm.week1;


 /**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 加一
 * @Link: https://leetcode-cn.com/problems/plus-one/
 * @Thinking: case1不进位 尾数 + 1,case2部分进位,case3全部进位,最终的结果是直接首位 + 1
 * @TimeSpaceComplexityExplain: T: O(n) S: 理想清空下O(1)，最差的情况O(n+1)
 */
 
public class Problem07 {
    public int[] plusOne(int[] digits) {
      
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            digits[i] %= 10;
            if (digits[i] != 0) {
				// 不用进位
                return digits;
            }
        }
		// 全部进位
        int[] newInt = new int[digits.length + 1];
        newInt[0] = 1;
//        System.arraycopy(digits, 0, newInt, 1, digits.length - 1);
        return newInt;
    }
}
