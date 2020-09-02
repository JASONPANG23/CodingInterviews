package top.jasonpang.solution.more.认识异或骚操作.数组中唯一一个出现奇数次的数;

/**
 * description:
 * 一个数组中又一种数出现了基数次，其他数都出现了偶数次，志明找到并打印这种数
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution {

    public static int solution(int arr[]){
        int num = 0;
        for (int i : arr){
            num ^= i;
        }
        return num;
    }
}
