package top.jasonpang.solution.more.认识异或骚操作.取出一个数最右侧的一;

/**
 * description:
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution {
    /**
     * 一个数，取出最右侧的一
     */
    public static int solution(int num){
        return num & ((~num) + 1) ;
    }
}
