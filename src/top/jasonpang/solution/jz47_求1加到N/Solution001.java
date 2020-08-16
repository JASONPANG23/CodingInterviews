package top.jasonpang.solution.jz47_求1加到N;

/**
 * description:
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    public int Sum_Solution(int n) {
        // boolean x 和 > 0 只是为了不报错
        boolean x = (n > 1 && (n += Sum_Solution(n - 1)) > 0);
        return n;
    }
}
