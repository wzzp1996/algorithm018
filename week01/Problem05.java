package com.xxx.algorithm.week1;

import java.util.HashMap;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 两数之和
 */
public class Problem05 {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) {
            return new int[0];
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
