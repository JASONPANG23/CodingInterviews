package top.jasonpang.solution.jz09_变态跳台阶;

/**
 * description:
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author Jason
 * Created in 2020-08-02 11:22.
 */
public class Solution001 {
    public int JumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= target; i++) {
            for (int j = 0 ; j < i ; j++){
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }
}
