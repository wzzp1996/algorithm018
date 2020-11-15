/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/15 20:19
 * @Description: 寻找旋转排序数组中的最小值
 * @Link: https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 * @Thinking: 二分查找，两个指针指向的值谁小就把中值给那个指针，直到俩指针紧挨在一起。之后取指向值最小的那个指针
 * @TimeSpaceComplexityExplain: T:O(log(N)) S: O(1)
 */
class Problem03 {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < nums.length && left < right) {
            if (right - left == 1) {
                if (nums[left] < nums[right]) {
                    return nums[left];
                } else {
                    return nums[right];
                }
            }
            mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return nums[mid];
    }
}