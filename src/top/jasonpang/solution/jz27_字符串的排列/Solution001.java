package top.jasonpang.solution.jz27_字符串的排列;

import java.util.*;

/**
 * description:
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * @author Jason
 * Created in 2020-08-05 23:17.
 */
public class Solution001 {
    public ArrayList<String> Permutation(String str) {
        if(str == null || str.length() == 0){
            return new ArrayList<>();
        }
        Iterator<String> result = Permutation(str.toCharArray(), 0);
        ArrayList<String> realResult = new ArrayList<>();
        while(result.hasNext()){
            realResult.add(result.next());
        }
        Collections.sort(realResult);
        return realResult;
    }

    private Iterator<String> Permutation(char[] str, int pos){
        if(pos == str.length - 1){
            return Collections.singletonList(String.valueOf(str[pos])).iterator();
        }
        Set<String> result = new HashSet<>();
        for (int i = pos; i < str.length; i++) {
            swap(str,pos,i);
            Iterator<String> subResult = Permutation(str, pos + 1);
            while(subResult.hasNext()){
                result.add(str[pos] + subResult.next());
            }
            swap(str,pos,i);
        }
        return result.iterator();
    }

    private void swap(char[] str,int a,int b){
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }

}
