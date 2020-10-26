package com.xxx.algorithm.week1;

/**
 * @Author: zhangzhipeng
 * @Date: 2020/10/26 20:19
 * @Description: 设计循环双端队列
 */
public class MyCircularDeque {
    int[] emelent = null;

    int size = 0;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        emelent = new int[k];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (emelent == null || isFull()) {
            return false;
        }
        System.arraycopy(emelent, 0, emelent, 1, emelent.length - 1);
        size++;
        emelent[0] = value;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (emelent == null || isFull()) {
            return false;
        }
        emelent[size++] = value;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (emelent == null || size == 0) {
            return false;
        }
        System.arraycopy(emelent, 1, emelent, 0, emelent.length - 1);
        emelent[emelent.length - 1] = 0;
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        emelent[--size] = 0;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (size == 0) {
            return -1;
        }
        int temp = emelent[0];
        // deleteFront();
        return temp;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (size == 0) {
            return -1;
        }
        int temp = emelent[size - 1];
        // deleteLast();
        return temp;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return emelent.length == size;
    }
}
