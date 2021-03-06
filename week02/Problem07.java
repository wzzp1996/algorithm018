package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: N叉树的层序遍历
 * @Link: https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
 * @Thinking: 一层一层元素的遍历，
 * @TimeSpaceComplexityExplain: 递归T O(n) S O(n + n(所有暂存的集合)) 迭代T O(n) S O(n + 辅助栈(O(n)))
 */
public class Problem07 {
    public List<List<Integer>> levelOrder(Node root) {
        // 迭代实现
        // List<List<Integer>> result = new ArrayList<List<Integer>>();
        // if(root == null) {
        //     return result;
        // }
        // // 使用辅助队列记录元素
        // Queue<Node> queue = new LinkedList<Node>();
        // queue.add(root);
        // while (!queue.isEmpty()){
        //     List<Integer> level = new ArrayList<Integer>();
        //     int size = queue.size();
        //     for (int i = 0; i < size; i++) {
        //         root = queue.poll();
        //         level.add(root.val);
        //         queue.addAll(root.children);
        //     }
        //     result.add(level);
        // }
        // return result;

        // 递归实现
        if (root != null) {
            levelOrder(root, 0);
        }
        return result;
    }

    public void levelOrder(Node root, int level) {
        List<Integer> list;
        if (result.size() <= level) {
            list = new ArrayList<Integer>();
            result.add(list);
        }
        list = result.get(level);
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            levelOrder(root.children.get(i), level + 1);
        }
    }
}
