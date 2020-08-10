package top.jasonpang.solution.jz41_和为S的连续正数序列;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 1 ; i < sum; i++) {
            int t = 0;
            for (int j = i; j < sum; j++) {
                t += j;
                if(t == sum){
                    ArrayList<Integer> subRes = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        subRes.add(k);
                    }
                    res.add(subRes);
                    break;
                }
            }
        }
        return res;
    }
}
