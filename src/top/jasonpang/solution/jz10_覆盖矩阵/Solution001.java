package top.jasonpang.solution.jz10_覆盖矩阵;

/**
 * description:
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * @author Jason
 * Created in 2020-08-02 11:35.
 */
public class Solution001 {
    public int RectCover(int target) {
        if(target == 0 || target == 1 || target == 2){
            return target;
        }
        int [] help = new int[target + 1];
        help[1] = 1 ;
        help[2] = 2 ;
        for (int i = 3 ; i <= target ; i ++){
            help[i] = help[i - 1] + help[i - 2];
        }
        return help[target];
    }
}
