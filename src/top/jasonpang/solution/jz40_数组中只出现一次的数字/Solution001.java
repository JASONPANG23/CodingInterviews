package top.jasonpang.solution.jz40_数组中只出现一次的数字;

/**
 * description:
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int res = 0 ;
        // 一个整型数组里除了两个数字之外，其他的数字都出现了两次
        // 前置知识点： n ^ 0 = n 、 n ^ n = 0
        // 所以res最后的结果是两个不同的数字进行异或
        for (int value : array){
            res ^= value;
        }
        //找出第一个不相等的位
        res &= (-res);
        for (int value : array){
            //使用该位进行分组,该位为1的分到num1,不为1的分到num2
            //分组后，相同的数一定在一组，由于该位是以两个不同的数来确定的
            //所以不同的数一定不在一组，再根据相同的数异或为0，所以最后可以得到答案
            if( (value & res) == 1){
                num1[0] ^= value;
            }else{
                num2[0] ^= value;
            }
        }
    }


    public static void main(String[] args) {
        new Solution001().FindNumsAppearOnce(new int[]{2,4,3,6,3,2,5,5},new int[]{0},new int[]{0});
    }
}
