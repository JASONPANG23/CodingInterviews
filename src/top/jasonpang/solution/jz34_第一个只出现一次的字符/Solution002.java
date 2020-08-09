package top.jasonpang.solution.jz34_第一个只出现一次的字符;

import java.util.BitSet;
/**
 * description:
 *
 * @author Jason
 * Created in 2020-08-08 15:00.
 */
public class Solution002 {
    public int FirstNotRepeatingChar(String str) {
        BitSet bitSet1 = new BitSet(52 * 8);
        BitSet bitSet2 = new BitSet(52 * 8);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(bitSet1.get(c)){
                bitSet2.set(c);
            }else{
                bitSet1.set(c);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(!bitSet2.get(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
