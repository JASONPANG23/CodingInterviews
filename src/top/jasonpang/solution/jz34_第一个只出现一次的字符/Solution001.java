package top.jasonpang.solution.jz34_第一个只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 * @author Jason
 * Created in 2020-08-08 14:53.
 */
public class Solution001 {
    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map = new HashMap<>(str.length());
        for (char c : str.toCharArray()){
            map.put(c,map.get(c) == null ? 1 : map.get(c) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
