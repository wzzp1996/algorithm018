package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 合并两个有序链表
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
        // 方法一：比较链表的元素，元素小就把该节点放新入
        ListNode head = new ListNode();
        ListNode listNode = head;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                listNode.next = l1;
                listNode = listNode.next;
                l1 = l1.next;
            } else {
                listNode.next = l2;
                listNode = listNode.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            listNode.next = l1;
            listNode = listNode.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            listNode.next = l2;
            listNode = listNode.next;
            l2 = l2.next;
        }
        return head.next;
    }
}
