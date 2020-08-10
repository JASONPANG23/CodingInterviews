package top.jasonpang.solution.jz41_和为S的连续正数序列;

import java.util.ArrayList;

/**
 * description:
 * 滑动窗口
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution002 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int p0 = 1 ;
        int p1 = 1 ;
        int t = 0;
        while (p0 <= (sum >> 1)){
            if(t > sum){
                // 缩小窗口
                t -= p0;
                ++ p0;
            }else if(t < sum){
                // 扩大窗口
                t += p1 ;
                ++ p1 ;
            }else{
                ArrayList<Integer> subRes = new ArrayList<>(p1 - p0);
                for (int i = p0; i < p1; ++i) {
                    subRes.add(i);
                }
                res.add(subRes);
                t -= p0;
                ++ p0;
            }
        }
        return res;
    }
}
