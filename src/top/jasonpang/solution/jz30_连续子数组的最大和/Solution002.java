package top.jasonpang.solution.jz30_连续子数组的最大和;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-08-08 13:23.
 */
public class Solution002 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0){
            return 0;
        }
        int res = 0;
        int tmp = 0;
        for (int value : array){
            if(tmp + value < 0){
                tmp = 0;
            }else{
                tmp += value;
            }
            res = Math.max(tmp,res);
        }
        if(res == 0){
            res = Integer.MIN_VALUE;
            for (int value : array){
                res = Math.max(res,value);
            }
        }
        return res;
    }
}
