package top.jasonpang.solution.more.认识异或骚操作.数出二进制中1的个数;

/**
 * description:
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution {

    public static void solution(int n){
        int res = 0 ;
        //不断提取最右侧的1
        while(n != 0){
            n ^= (n & (~n + 1));
            res ++ ;
        }
        System.out.println(res);
    }
}
