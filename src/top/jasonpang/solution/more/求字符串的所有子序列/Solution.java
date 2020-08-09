package top.jasonpang.solution.more.求字符串的所有子序列;

import java.util.List;

/**
 * description:
 * 打印一个字符串中的所有子字符串
 * @author Jason
 * Created in 2020-08-02 20:04.
 */
public class Solution {

    public static void printAllSubString(char[] str,int i,String res){
        //base case
        if(i < str.length){
            System.out.println(res);
            return;
        }
        printAllSubString(str, i + 1, res);
        printAllSubString(str, i + 1, res + String.valueOf(str[i]));
    }
}
