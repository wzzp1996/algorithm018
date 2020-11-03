package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 二叉树的中序遍历
 * @Link: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * @Thinking: 中序节点遍历的顺序左->根->右，递归的实现便于书写。迭代得用双层while循环，用Stack记录最左列所有节点，完成之后依次弹栈，并且还要使用right节点。比较难以书写和理解
 * @TimeSpaceComplexityExplain: T O(n) S O(n)
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
