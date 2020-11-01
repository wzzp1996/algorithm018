package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: N叉树的前序遍历
 * @Link: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
 * @Thinking:
 * @TimeSpaceComplexityExplain:
 */
public class Problem01 {
    public List<Integer> preorder(Node root) {
        // 迭代
        // if(root == null) {
        //     return new ArrayList();
        // }
        // // 辅助栈
        // Stack<Node> stack = new Stack<Node>();
        // List result = new ArrayList<Integer>();
        // stack.push(root);
        // while(!stack.empty()) {
        //     root = stack.pop();
        //     result.add(root.val);
        //     List<Node> children = root.children;
        //     for (int i = children.size() - 1; i >= 0; i--) {
        //         stack.push(children.get(i));
        //     }
        // }
        // return result;
        if (root == null) {
            return new ArrayList();
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(root.val);
        List<Node> nodeList = root.children;
        for (int i = 0; i < nodeList.size(); i++) {
            result.addAll(preorder(nodeList.get(i)));
        }
        return result;
    }
}
