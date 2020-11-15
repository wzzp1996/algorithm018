/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/15 20:19
 * @Description: 搜索二维矩阵
 * @Link: https://leetcode-cn.com/problems/search-a-2d-matrix/
 * @Thinking: 矩阵第一列先二分，在结束列和上下列继续进行二分查找（二分查找结束后指针会有所移动）
 * @TimeSpaceComplexityExplain: T O(log(M) + 3log(N) )  S O(1)
 */
class Problem02 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 方法一：二维数组转一维，单调递增。二分搜索 T:O(m * n + log(mn)) S:O(m*n)
        // 方法二: 直接在二位数组进行搜索 x/2、y/2
        int righty = matrix.length - 1;
        if (righty < 0) {
            return false;
        }
        int rightx = matrix[0].length - 1;
        if (rightx < 0) {
            return false;
        }
        int lefty = 0,  leftx = 0;
        int midy = 0;
        boolean isbig = false;
        while(lefty < matrix.length && lefty <= righty) {
            midy = (righty + lefty)/2;
            if (matrix[midy][0] < target) {
                lefty = midy + 1;
            } else if (matrix[midy][0] > target) {
                righty = midy - 1;
            } else {
                return true;
            }
        }
        if (lefty < matrix.length && -1 != searchTarget(matrix[lefty], target)) {
            return true;
        }
        if (lefty < matrix.length - 1 && - 1 != searchTarget(matrix[lefty + 1], target)) {
            return true;
        }
        if (lefty > 0 && -1 != searchTarget(matrix[lefty - 1], target)) {
            return true;
        }
        return false;
    }

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
}