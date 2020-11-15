学习笔记
二分查找模板
public int searchTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < nums.length && left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
二分查找时间复杂度：O(logN)

二分查找无序的地方思路：二分查找，两个指针指向的值谁小就把中值给那个指针，直到俩指针紧挨在一起。之后取指向值最小的那个指针
代码：见problem03