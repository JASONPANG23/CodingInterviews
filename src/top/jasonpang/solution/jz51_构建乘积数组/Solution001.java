package top.jasonpang.solution.jz51_构建乘积数组;

import java.util.Arrays;

/**
 * description:
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * @author Jason
 * Created in 2020-07-20 09:39.
 */
public class Solution001 {

    public int[] multiply(int[] A) {
        int[] help1 = new int[A.length] ;
        int[] help2 = new int[A.length] ;
        int[] B = new int[A.length] ;
        for (int i = 0; i < A.length; i++) {
            help1[i] = help2[i] = 1;
        }
        for (int i = 1; i < help1.length; i++) {
            help1[i] = help1[i - 1] * A[i - 1] ;
        }
        for (int i = help2.length - 2; i >= 0; i--) {
            help2[i] = help2[i + 1] * A[i + 1] ; 
        }
        for (int i = 1; i < B.length - 1; i++) {
            B[i] = help1[i] * help2[i] ;
        }
        B[0] = help2[0] ;
        B[B.length - 1] = help1[B.length - 1] ;
        return B;
    }

    public static void main(String[] args) {
        int[] result = new Solution001().multiply(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }

}
