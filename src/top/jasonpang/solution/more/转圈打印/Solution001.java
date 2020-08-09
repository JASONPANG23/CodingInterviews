package top.jasonpang.solution.more.转圈打印;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-25 10:31.
 */
public class Solution001 {

    public void print(int[][] array){
        if(array == null || array[0] == null){
            return ;
        }
        ArrayList<Integer> result = new ArrayList<>(array.length * array[0].length);
        //转圈打印矩阵
        int a = 0;
        int b = 0;
        int c = array.length - 1;
        int d = array[0].length - 1;
        do {
            printEdge(array, result, a, b, c, d);
            a++;
            b++;
            c--;
            d--;
        } while (a <= c && b <= d);
        System.out.println(printResult(result));
    }
    
    private void printEdge(int[][] array, List<Integer> result, int a , int b , int c , int d){

        //只有一行的情况
        if(a == c){
            for (int i = b; i <= d; i++) {
                result.add(array[a][i]);
            }
        }
        //只有一列的情况
        else if (b == d){
            for (int i = a; i <= c; i++) {
                result.add(array[i][b]);
            }
        }else{
            for (int i = b; i < d; i++) {
                result.add(array[a][i]);
            }
            for (int i = a; i < c; i++) {
                result.add(array[i][d]);
            }
            for (int i = d ; i > b ; i--) {
                result.add(array[c][i]);
            }
            for (int i = c; i > a ; i--) {
                result.add(array[i][b]);
            }
        }
    }

    private String printResult(List<Integer> result){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.size() - 1; i++) {
            stringBuilder.append(result.get(i)).append("=>");
        }
        stringBuilder.append(result.get(result.size() - 1)) ;
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        int[][] array = new int[][]{
            {1,2,3,4}
        };

        Solution001 solution001 = new Solution001();
        solution001.print(array);
    }
}
