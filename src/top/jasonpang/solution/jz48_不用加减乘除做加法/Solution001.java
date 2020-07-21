package top.jasonpang.solution.jz48_不用加减乘除做加法;

/**
 * description:
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author Jason
 * Created in  2020/7/20 23:36
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