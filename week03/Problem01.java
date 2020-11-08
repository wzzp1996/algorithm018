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
 * @Description: 二叉树的最近公共祖先
 * @Link: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * @Thinking: 遍历树节点，遍历的节点和p、q相等时即找到该节点的最近父节点，为null则没有
 *            case1：左边能找到，右边找不到。返回左边的元素
 *            case2：左边找不到，右边能找到。返回右边的元素
 *            case3：左边右边能找到。返回root
 * @TimeSpaceComplexityExplain: T O(n) S O(1)
 */
class Problem01 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // terminator
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
}