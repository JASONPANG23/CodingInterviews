package top.jasonpang.solution.more.从左上角到右下角的最短路径和;

/**
 * description:
 * 使用动态规划
 * 从左上角到右下角的最短路劲和
 * 每次只能往下或往右走一步
 * @author Jason
 * Created in 2020-08-03 20:13.
 */
public class Solution002 {

    private static int walk(int[][]matrix,int i,int j){
        int [][] dp = new int[matrix.length][matrix[0].length];
        //计算base case的情况
        dp[matrix.length - 1][matrix[0].length - 1]
                = matrix[matrix.length - 1][matrix[0].length - 1];

        // 计算下边界
        for (int k = matrix[0].length - 1; k > 0; k--) {
            dp[matrix.length - 1][k - 1] = matrix[matrix.length - 1][k - 1] + dp[matrix.length - 1][k];
        }

        // 计算右边界
        for (int k = matrix.length - 1; k > 0; k--) {
            dp[k - 1][matrix[0].length - 1] = matrix[k - 1][matrix[0].length - 1] + dp[k][matrix[0].length - 1];
        }

        // 计算中间部分
        for (int k = matrix.length - 2 ; k > 0; k--) {
            for (int l = matrix[0].length - 2; l > 0; l--) {
                int right = dp[k][l + 1];
                int down  = dp[k + 1][l];
                dp[k][l] = Math.min(right,down);
            }
        }
        return dp[0][0];
    }
}
