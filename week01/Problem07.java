package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 加一
 */
public class Problem07 {
    public int[] plusOne(int[] digits) {
        // 不进位 尾数 + 1
        // 部分进位
        // 全部进位：首位 + 1
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] newInt = new int[digits.length + 1];
        newInt[0] = 1;
//        System.arraycopy(digits, 0, newInt, 1, digits.length - 1);
        return newInt;
    }
}
