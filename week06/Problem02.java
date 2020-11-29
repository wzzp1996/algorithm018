/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/29 20:19
 * @Description: 91. 解码方法
 * @Link: https://leetcode-cn.com/problems/decode-ways/submissions/
 * @Thinking: TODO
 * @TimeSpaceComplexityExplain: T:O(n) S:O(1)
 */
class Solution {
    public int numDecodings(String s) {
        if (null == s || s.length() == 0 || s.charAt(0) == '0'){
            return 0;
        }
        int pre = 1, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            int temp = cur;
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1)== '2'){                       cur = pre;
                }else {
                    return 0;
                }
            } else if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6')) {
                cur = cur + pre;
            }
            pre = temp;
        }
        return cur;
    }
}