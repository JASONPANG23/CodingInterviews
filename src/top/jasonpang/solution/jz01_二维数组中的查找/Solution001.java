package top.jasonpang.solution.jz01_二维数组中的查找;

/**
 * description:
 * （一道题的最优解来自于他的数据状况）
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author Jason
 * Created in 2020-07-25 11:03.
 */
public class Solution001 {
    public boolean Find(int target, int [][] array) {
        if(array == null || array[0] == null){
            return false ;
        }
        int i = 0;
        int j = array[0].length - 1 ;
        while(i <= array.length - 1 && j >=0){
            int result = target - array[i][j];
            if(result == 0){
                return true;
            }
            //target 大于当前目标值
            if(result > 0){
                i ++ ;
            }else{
                // target 小于当前目标值
                j -- ;
            }
        }
        return false ;
    }
}
