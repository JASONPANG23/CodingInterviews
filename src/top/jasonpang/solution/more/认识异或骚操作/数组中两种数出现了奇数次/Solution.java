package top.jasonpang.solution.more.认识异或骚操作.数组中两种数出现了奇数次;

/**
 * description:
 * 一个数组中有两种数出现了基数次，其他数都出现了偶数次，怎么找到并打印这两种数
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution {

    // arr中有两种数出现了基数次
    public static void solution(int[] arr){
        int eor = 0 ;
        for (int i : arr){
            eor ^= i;
        }

        //eor = a  ^ b
        //eor != 0
        //eor必然有一个位置上是1
        //提取最左位1的数
        int t = eor & ((~eor)+ 1) ;
        int r = 0;
        for (int i : arr){
            if((i & t) == 0){
                r ^= i;
            }
        }
        int res1 = r ;
        int res2 = eor ^ r;
    }
}
