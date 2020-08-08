package top.jasonpang.solution.jz11_二进制中1的个数;

/**
 * description:
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 * @author Jason
 * Created in 2020-08-02 13:23.
 */
public class Solution002 {
    public int NumberOf1(int n) {
        //每次执行把最低位的1消掉
        int result = 0;
        while(n != 0){
            n = n & (n - 1);
            result ++;
        }
        return result;
    }
}
