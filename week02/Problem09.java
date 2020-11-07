package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 前 K 个高频元素
 * @Link: https://leetcode-cn.com/problems/top-k-frequent-elements/
 * @Thinking:hashmap key->nums[i] value->count  k频率最高的PriorityQueue以hashmap的value 排序
 * @TimeSpaceComplexityExplain: T: O(k * logN) S:O(n)
 */
public class Problem07 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.get(nums[i]) == null) {
                hashmap.put(nums[i], 1);
            } else {
                hashmap.put(nums[i], hashmap.get(nums[i]) + 1);
            }
        }
        PriorityQueue<Integer> p = new PriorityQueue(
                new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return  hashmap.get(o2) - hashmap.get(o1); // 由高到低
                    }
                }
        );
        Set<Integer> keys = hashmap.keySet();
        for (Integer i : keys) {
            p.offer(i);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = p.poll();
        }
        return result;
    }
}
