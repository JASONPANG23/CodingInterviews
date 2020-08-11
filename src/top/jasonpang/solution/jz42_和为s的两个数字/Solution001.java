package top.jasonpang.solution.jz42_和为s的两个数字;

import java.util.ArrayList;

/**
 * description:
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array.length <= 2){
            return res;
        }
        int p0 = 0;
        int p1 = array.length - 1;
        int help = Integer.MAX_VALUE;
        int res0 = 0;
        int res1 = 0;
        while(p0 < p1){
            int t = array[p0] + array[p1];
            if(t > sum){
                p1 --;
            }else if(t < sum){
                p0 ++;
            }else{
                if(array[p0] + array[p1] < help){
                    help = array[p0] + array[p1];
                    res0 = array[p0];
                    res1 = array[p1];
                }
                p1 --;
            }
        }
        if(help != Integer.MAX_VALUE){
            res.add(res0);
            res.add(res1);
        }
        return res ;
    }
}
