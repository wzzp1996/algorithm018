package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 二叉树的前序遍历
 * @Link: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @Thinking:前序遍历节点遍历的顺序根->左->右，递归的实现便于书写。迭代得用双层while循环，用Stack记录最左列所有节点，完成之后依次弹栈，并且还要使用right节点。比较难以书写和理解
 * @TimeSpaceComplexityExplain: T O(n) S O(n)
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
