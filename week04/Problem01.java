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
 * @Date: 2020/11/15 20:19
 * @Description: 搜索旋转排序数组
 * @Link: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * @Thinking: 旋转过的有序数组，如果目标数组比第0个数组大那就从左边找，否则从右边找
 * @TimeSpaceComplexityExplain: T O(n) S O(1)
 */
class Problem01 {

    public int search(int[] nums, int target) {
        // 1、[0]
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums[0] > target) {
            // right
            int i = nums.length - 1;
            while(i > 0){
                if (nums[i] != target) {
                    i--;
                } else {
                    return i;
                }
            }
        } else if (nums[0] < target) {
            // left
            int i = 1;
            while (i < nums.length){
                if (nums[i] != target) {
                    i++;
                } else {
                    return i;
                }
            }
        } else {
            return 0;
        }
        return -1;
    }
}