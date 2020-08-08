package top.jasonpang.solution.jz08_跳台阶;

/**
 * description:
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author Jason
 * Created in 2020-08-02 11:12.
 */
public class Solution001 {
    public int JumpFloor(int target) {
        if(target <= 2){
            return target;
        }
        int[] dp = new int[target + 1];
        dp[1] = 1 ;
        dp[2] = 2 ;
        for (int i = 3 ; i <= target ; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[target];
    }
}
