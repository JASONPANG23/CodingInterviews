package top.jasonpang.solution.jz51_构建乘积数组;

import java.util.Arrays;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-20 19:06.
 */
public class Solution002 {
    public int[] multiply(int[] A) {

        int[] B = new int[A.length] ;
        Arrays.fill(B, 1);
        for (int i = 1; i < A.length; i++) {
            //B[i] 存储B[0]到B[i-1]的连乘结果
            B[i] = B[i - 1] * A[i - 1] ;
        }

        //temp 保存从右往左连乘的结果
        int temp = 1 ;
        for (int i = B.length - 2 ; i >=0 ; i --){
            temp *= A[i + 1] ;
            B[i] *= temp;
        }
        return B ;
    }
}
