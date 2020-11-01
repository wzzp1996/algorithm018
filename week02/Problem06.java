package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 二叉树的前序遍历
 * @Link: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @Thinking:
 * @TimeSpaceComplexityExplain:
 */
public class Problem01 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
