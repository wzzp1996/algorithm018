package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 二叉树的中序遍历
 * @Link: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * @Thinking:
 * @TimeSpaceComplexityExplain:
 */
public class Problem01 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
