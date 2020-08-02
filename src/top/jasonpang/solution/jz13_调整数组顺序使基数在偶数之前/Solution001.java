package top.jasonpang.solution.jz13_调整数组顺序使基数在偶数之前;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author Jason
 * Created in 2020-08-02 13:42.
 */
public class Solution001 {
    public void reOrderArray(int [] array) {
        List<Integer> help = new ArrayList<>(array.length);
        for (int item : array) {
            if ((item & 1) != 0) {
                help.add(item);
            }
        }
        for (int value : array) {
            if ((value & 1) == 0) {
                help.add(value);
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = help.get(i);
        }
    }
}
