package top.jasonpang.solution.more.排序后求相邻两数最大差值;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-08-03 22:48.
 */
public class Solution001 {

    private int maxGap(int []nums){
        if(nums == null || nums.length ==0){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        if(min == max){
            return 0;
        }
        boolean [] hasNum = new boolean[nums.length + 1];
        int [] maxs = new int[nums.length + 1] ;
        int [] mins = new int[nums.length + 1] ;
        for (int i = 0; i < nums.length; i++) {
            int bit = bucket(nums[i],nums.length,min,max);
            hasNum[bit] = true;
            maxs[bit] = Math.max(maxs[bit],nums[i]);
            mins[bit] = Math.min(mins[bit],nums[i]);
        }

        int res = 0;
        int lastMax = maxs[0];
        for (int i = 1; i < nums.length; i++) {
            if(hasNum[i]){
                res = Math.max(res,mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    //计算桶位
    private int bucket(long num,long len,long min,long max){
        return (int) ((num - min) * len /(max -min));
    }
}
