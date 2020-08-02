package top.jasonpang.solution.jz19_顺时针打印矩阵;
import java.util.ArrayList;
/**
 * description:
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如:
 * 如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字        1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author Jason
 * Created in 2020-08-02 16:39.
 */
public class Solution001 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        //转圈打印矩阵
        int a = 0;
        int b = 0;
        int c = matrix.length - 1;
        int d = matrix[0].length - 1;
        do {
            result.addAll(printEdge(matrix, a, b, c, d));
            a++;
            b++;
            c--;
            d--;
        } while (a <= c && b <= d);
        return result;
    }
    private ArrayList<Integer> printEdge(int [][] matrix,int a,int b,int c,int d){
        ArrayList<Integer> result = new ArrayList<>();
        //只有一行的情况
        if(a == c){
            for (int i = b; i <= d; i++) {
                result.add(matrix[a][i]);
            }
        }
        //只有一列的情况
        else if (b == d){
            for (int i = a; i <= c; i++) {
                result.add(matrix[i][b]);
            }
        }else{
            for (int i = b; i < d; i++) {
                result.add(matrix[a][i]);
            }
            for (int i = a; i < c; i++) {
                result.add(matrix[i][d]);
            }
            for (int i = d ; i > b ; i--) {
                result.add(matrix[c][i]);
            }
            for (int i = c; i > a ; i--) {
                result.add(matrix[i][b]);
            }
        }
        return result;
    }
}
