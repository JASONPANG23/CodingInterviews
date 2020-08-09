package top.jasonpang.solution.jz27_字符串的排列;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-08-06 00:20.
 */
public class Solution002 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(str == null || str.isEmpty()){
            return result;
        }
        Set<String> helpSet = new TreeSet<>();
        Permutation(str.toCharArray(),0,helpSet);
        result.addAll(helpSet);
        return result;
    }

    private void Permutation(char[] str,int begin, Set<String> res){
        //位置都调整好之后
        if(begin == str.length - 1){
            res.add(String.valueOf(str));
            return ;
        }
        for (int i = 0; i < str.length; i++) {
            //固定第i个元素
            swap(str,begin,i);
            Permutation(str,begin + 1,res);
            swap(str,begin,i);
        }
    }

    private void swap(char[] str,int a,int b){
        char t = str[a];
        str[a] = str[b];
        str[b] = t;
    }
}
