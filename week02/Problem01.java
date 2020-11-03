package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 有效的字母异位词
 * @Link: https://leetcode-cn.com/problems/valid-anagram/description/
 * @Thinking: 方法1：hash法，用26位长度的数组记录字符串出现的次数，一个加一个减，最终的结果为0则满足。方法二：将数组排序，for循环比较，每个字符都相等则满足。
 * @TimeSpaceComplexityExplain: 方法一、T：O(n + 26) S:O(26) 方法二：O(2nlong(N) + O(n)) S:O(n)
 */
public class Problem01 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // int[] temp = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     temp[s.charAt(i) - 'a']++;
        //     temp[t.charAt(i) - 'a']--;
        // }
        // for (int i = 0; i < 26; i++) {
        //     if(temp[i] != 0) {
        //         return false;
        //     }
        // }
        // return true;

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
