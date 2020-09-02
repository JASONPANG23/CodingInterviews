package top.jasonpang.solution.more.认识异或骚操作.交换两个变量;

/**
 * description:
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution {

    public static void swap(int arr[] , int a,int b){
        if(a == b){
            //如果是同一个内存区域会出问题
            //其实这个过程就是两个内存区域来回倒
            //其中有一个做临时区域
            return;
        }
        //前置知识
        //a ^ a = 0
        //a ^ 0 = a
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}
