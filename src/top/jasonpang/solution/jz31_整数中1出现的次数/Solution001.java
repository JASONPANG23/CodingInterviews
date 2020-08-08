package top.jasonpang.solution.jz31_整数中1出现的次数;

/**
 * description:
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 *
 * todo : 更优的方法
 *
 * @author Jason
 * Created in 2020-08-08 13:30.
 */
public class Solution001 {
    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            builder.append(i);
        }
        return calculate(builder.toString());
    }

    private int calculate(String str){
        char[] chars = str.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar - '1' == 0x00) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
