/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/8 20:19
 * @Description: 全排列
 * @Link: https://leetcode-cn.com/problems/permutations/
 * @Thinking: 递归状态图见图：全排列I递归状态图.png
 * @TimeSpaceComplexityExplain: T：O(n!) S: O(n)
 */
class Problem04 {

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        permute(list, nums.length, 0);
        return result;
    }

    public void permute(List numsList, int length, int first) {
        if (first == length) {
            result.add(new ArrayList<>(numsList));
            return;
        }
        for (int i = first; i < length; i++) {
            if (first != i) {
                Collections.swap(numsList, first, i);
            }
            permute(numsList, length, first + 1);
            if (first != i) {
                Collections.swap(numsList, first, i);
            }
        }
    }

    List<List<Integer>> result = new ArrayList<>();
}