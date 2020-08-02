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
        int[] help = new int[target + 1];
        help[1] = 1 ;
        help[2] = 2 ;
        for (int i = 3 ; i <= target ; i++){
            help[i] = help[i - 1] + help[i - 2];
        }
        return help[target];
    }
}
