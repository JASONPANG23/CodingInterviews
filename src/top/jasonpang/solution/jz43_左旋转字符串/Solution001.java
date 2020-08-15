package top.jasonpang.solution.jz43_左旋转字符串;

import java.util.Arrays;

/**
 * description:
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    public String LeftRotateString(String str,int n) {
        if(str == null || str.isEmpty()){
            return "";
        }
        char[] chars = str.toCharArray();
        char[] t = new char[n];
        System.arraycopy(chars, 0, t, 0, n);
        for (int i = n; i < chars.length; i++) {
            chars[i - n] = chars[i];
        }
        for (int i = chars.length - n; i < chars.length; i++) {
            chars[i] = t[i - (chars.length - n)];
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String result = new Solution001().LeftRotateString("abcdefg", 3);
        System.out.println(result);
    }
}
