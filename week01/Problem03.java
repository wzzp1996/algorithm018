package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 合并两个有序链表
 * @Link: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @Thinking: 两个链表同时迭代，谁小将此元素放入合并后的新链表，直到其中一个链表的下一个元素为空
 * @TimeSpaceComplexityExplain: T: O(Math.max(n,  m)) S: O(n + m + 1(空的头节点) +1(temp))
 */


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem03 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // 新链表,头元素为空(挂载到新链表只能用next的方式，不用在循环外面取一次)
        ListNode result = new ListNode();
        // 迭代过程中真实操作的变量
        ListNode temp = result;
        while(l1 != null && l2 != null) {
            // 挂载到新链表上
            temp.next = l1.val < l2.val ? l1 : l2;
            if (l1.val < l2.val) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
            temp = temp.next;
        }
        // l1 存在没迭代完的数据(全部比l2大)
        while(l1 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        // l2 存在没迭代完的数据(全部比l1大)
        while(l2 != null) {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        return result.next;
    }
}
