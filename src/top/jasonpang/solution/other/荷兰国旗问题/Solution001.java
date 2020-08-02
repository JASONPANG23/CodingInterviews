package top.jasonpang.solution.other.荷兰国旗问题;

/**
 * description:
 * 给定一个数组arr,和一个数num,请把小于num的数放在数组的左边
 * 等于放在数组中间，大于放在数组右边
 * @author Jason
 * Created in 2020-08-02 14:19.
 */
public class Solution001 {


    private static void swap(int[] arr,int a,int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}
