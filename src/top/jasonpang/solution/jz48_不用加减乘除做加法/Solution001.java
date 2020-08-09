package top.jasonpang.solution.jz48_不用加减乘除做加法;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-20 19:27.
 */
public class Solution001 {
    public int Add(int num1,int num2) {
        //计算a和b的无进位和，和进位
        //如果进位不为0，则说明a+b的结果等于无进位和+进位，此时，把无进位和作为a，进位作为b，继续计算
        //如果进位等于0， 说明此时a+b的结果就等于无进位和，返回无进位和即可。
        while(num2 != 0){
            int c = (num1 & num2) << 1 ; // 进位
            num1 ^= num2 ; //不进位
            num2 = c;
        }
        return num1 ;
    }
}
