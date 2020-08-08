package top.jasonpang.solution.jz32_把数组排列最小的数;

import java.util.*;

/**
 * description:
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @author Jason
 * Created in 2020-08-08 14:37.
 */
public class Solution001 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0){
            return "";
        }
        List<Integer> tmp = new ArrayList<>(numbers.length);
        for (int value : numbers){
            tmp.add(value);
        }
        tmp.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = String.valueOf(o1);
                String str2 = String.valueOf(o2);
                return (str1 + str2).compareTo(str2 + str1);
            }
        });
        StringBuilder builder = new StringBuilder();
        for (int value : tmp){
            builder.append(value);
        }
        return builder.toString();
    }

}
