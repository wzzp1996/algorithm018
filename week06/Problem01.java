/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/29 20:19
 * @Description: 64. 最小路径和
 * @Link: https://leetcode-cn.com/problems/minimum-path-sum/submissions/
 * @Thinking: TODO
 * @TimeSpaceComplexityExplain: T:O(m * n) S:O(m * n)
 */
class Problem01 {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        // 初始化上左元素
        for (int i = 1; i < dp.length; i++){
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < dp[0].length; i++){
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < grid[0].length; i++) {
            for (int j = 1; j < grid.length; j++ ){
                dp[j][i] = Math.min(dp[j - 1][i], dp[j][i - 1]) + grid[j][i];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}