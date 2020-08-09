package top.jasonpang.solution.jz11_二进制中1的个数;

/**
 * description:
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 * @author Jason
 * Created in 2020-08-02 11:54.
 */
public class Solution001 {
    public int NumberOf1(int n) {
        int result = 0;
        int mask = 0x01;
        while(mask != 0){
            if((n & mask)!=0){
                result ++ ;
            }
            mask <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new Solution001().NumberOf1(
                7);
        System.out.println(result);
    }
}
