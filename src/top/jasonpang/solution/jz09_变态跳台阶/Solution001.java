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
        if (target <= 2) {
            return target;
        }
        int[] help = new int[target + 1];
        help[0] = 0;
        help[1] = 1;
        help[2] = 2;
        for (int i = 0; i <= target; i++) {
            for (int j = 0 ; j < i ; j++){
                help[i] += help[j];
            }
        }
        return help[target];
    }
}
