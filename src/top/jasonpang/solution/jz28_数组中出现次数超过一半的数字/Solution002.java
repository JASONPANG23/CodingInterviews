package top.jasonpang.solution.jz28_数组中出现次数超过一半的数字;

import java.util.HashMap;

/**
 * description:
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 *
 *
 * @author Jason
 * Created in 2020-08-08 10:15.
 */
public class Solution002 {
    public int MoreThanHalfNum_Solution(int [] array) {
        //当前丛数候选人
        int candidate = -1 ;
        //当前候选人票数
        int count = 0;

        for (int value : array) {
            if (count == 0) {
                candidate = value;
                count++;
            } else {
                if (candidate == value) {
                    //候选人票数加一
                    count++;
                } else {
                    count--;
                }
            }
        }

        //经过上面的筛选，已得知出现次数最多的元素
        count = 0;
        for (int value : array){
            if(candidate == value){
                count ++ ;
            }
        }
        //校验出现次数最多的元素是否占数组一半以上
        return count > array.length ? candidate : 0;
    }
}
