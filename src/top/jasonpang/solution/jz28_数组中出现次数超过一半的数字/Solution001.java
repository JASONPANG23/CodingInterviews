package top.jasonpang.solution.jz28_数组中出现次数超过一半的数字;

import java.util.HashMap;

/**
 * description:
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author Jason
 * Created in 2020-08-07 20:09.
 */
public class Solution001 {
    public int MoreThanHalfNum_Solution(int [] array) {

        HashMap<Integer, Integer> map = new HashMap<>(array.length);
        for (int key : array){
            Integer value = map.get(key);
            map.put(key,value == null ? 1 : value + 1);
        }

        for (int key : map.keySet()){
            if(map.get(key) >= array.length / 2){
                return key;
            }
        }
        return 0;
    }
}
