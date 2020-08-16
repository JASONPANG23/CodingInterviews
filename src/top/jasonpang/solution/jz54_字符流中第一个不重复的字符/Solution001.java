package top.jasonpang.solution.jz54_字符流中第一个不重复的字符;

import java.util.*;

/**
 * description:
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    private Map<Character, Integer> map = new LinkedHashMap<>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        if (!map.containsKey(ch)) {
            map.put(ch, 1);
        } else {
            map.put(ch, -1);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (Map.Entry<Character, Integer> ch : map.entrySet()){
            if(ch.getValue() == 1){
                return ch.getKey() ;
            }
        }
        return '#';
    }
}
