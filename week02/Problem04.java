package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 字母异位词分组
 * @Link: https://leetcode-cn.com/problems/group-anagrams/
 * @Thinking:
 * @TimeSpaceComplexityExplain:
 */
public class Problem01 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            char[] chars = temp.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            // 每次都要去添加进map，可以不用写到else的逻辑里面
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(temp);
        }
        return new ArrayList(map.values());
    }
}
