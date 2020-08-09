package top.jasonpang.solution.jz12_数值的整数次方;

/**
 * description:
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 * @author Jason
 * Created in 2020-08-02 13:27.
 */
public class Solution001 {
    public double Power(double base, int exponent) {
        if(exponent == 0){
            return 1.0;
        }
        if(exponent < 0){
            base = 1 / base;
            exponent = -exponent;
        }
        double res = Power(base, exponent / 2);
        if((exponent & 1) == 1){
            res = res * res * base;
        }else{
            res = res * res;
        }
        return res;
    }
}
