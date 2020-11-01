package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/1 20:19
 * @Description: 前 K 个高频元素
 * @Link: https://leetcode-cn.com/problems/top-k-frequent-elements/
 * @Thinking:
 * @TimeSpaceComplexityExplain:
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
