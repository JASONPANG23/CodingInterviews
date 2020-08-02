package top.jasonpang.solution.jz07_斐波那契数列;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * description:
 * 大家都知道斐波那契数列(0,1,1,2,3,5,8,13)，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 * @author Jason
 * Created in 2020-07-26 21:45.
 */
public class Solution001 {

    public int Fibonacci(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int [] help = new int[n + 1];
        help[0] = 0;
        help[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            help[i] = help[i - 1] + help[i - 2] ;
        }
        return help[n] ;
    }

    public static void main(String[] args) throws IOException {

    }



}
