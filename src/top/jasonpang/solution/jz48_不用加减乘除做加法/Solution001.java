package top.jasonpang.solution.jz48_不用加减乘除做加法;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-20 19:27.
 */
public class Solution001 {
    public int Add(int num1,int num2) {
        while(num2 != 0){
            int c = (num1 & num2) << 1 ; // 进位
            num1 ^= num2 ; //不进位
            num2 = c;
        }
        return num1 ;
    }
}
