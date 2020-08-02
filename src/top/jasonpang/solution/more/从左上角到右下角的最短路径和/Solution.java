package top.jasonpang.solution.more.从左上角到右下角的最短路径和;

/**
 * description:
 * 从左上角到右下角的最短路劲和
 * 每次只能往下或往右走一步
 * @author Jason
 * Created in 2020-08-02 20:50.
 */
public class Solution {

    public static int walk(int[][] matrix, int i, int j) {
        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            //走到最右下角
            return matrix[i][j];
        }
        if (i == matrix.length - 1) {
            //走到下边界
            return matrix[i][j] + walk(matrix, i, j + 1);
        }
        if (i == matrix[0].length - 1) {
            //走到有边界
            return matrix[i][j] + walk(matrix, i + 1, j);
        }
        int right = matrix[i][j] + walk(matrix, i, j + 1);
        int down = matrix[i][j] + walk(matrix, i + 1, j);
        return Math.min(right, down);
    }
}
