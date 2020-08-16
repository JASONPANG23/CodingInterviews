package top.jasonpang.solution.jz50_数组中重复的数字;

import java.util.HashSet;

/**
 * description:
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution002 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            //将number[i]中的值归位
            //例如number[i] = m,那么就将number[i]放到m位置上
            if (numbers[i] != i) {
                //m位置上已经有对应的值了，出现重复
                if(numbers[numbers[i]] == numbers[i]){
                    duplication[0] = numbers[i];
                    return true ;
                }
                //将i位置上的值和m位置上的值进行交换
                swap(numbers,i,numbers[i]);
            }

        }
        return false ;
    }
    private void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b] ;
        arr[b] = arr[a] ^ arr[b] ;
        arr[a] = arr[a] ^ arr[b] ;
    }
}
