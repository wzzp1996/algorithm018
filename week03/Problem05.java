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
 * @Description: 全排列II
 * @Link: https://leetcode-cn.com/problems/permutations-ii/
 * @Thinking: 递归状态图见图：全排列II递归状态图.png
 * @TimeSpaceComplexityExplain: T: O(n^(n+1)) S:O(n)
 */
class Problem05 {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    boolean[] flag = null;

    LinkedList<Integer> list = new LinkedList();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return result;
        }
        flag = new boolean[nums.length];
        Arrays.sort(nums);
        permuteUnique(0, nums.length, nums);
        return result;
    }

    public void permuteUnique(int start, int end, int[] nums) {
        if (start == end) {
            result.add(new ArrayList(list));
            return;
        }
        // i = 0!!!!! 和前面的交换得到全排列的区别？
        for (int i = 0; i < end; i++) {
            if (flag[i] || (i > 0 && nums[i] == nums[i - 1] && !flag[i - 1])) {
                continue;
            }
            flag[i] = true;
            list.addLast(nums[i]);
            permuteUnique(start + 1, end, nums);
            list.removeLast();
            flag[i] = false;
        }
    }
}