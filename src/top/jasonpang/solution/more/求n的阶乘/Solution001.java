package top.jasonpang.solution.more.求n的阶乘;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-08-02 19:34.
 */
public class Solution001 {

    public static long getFactorial1(int n){
        //base case 当规模去到什么程度之后不需要再划分子问题
        if(n == 1){
            return 1L;
        }
        return (long) n * getFactorial1(n - 1);
    }
}
