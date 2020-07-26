package top.jasonpang.solution.jz06_旋转数组的最小数字;

/**
 * description:
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author Jason
 * Created in 2020-07-26 18:25.
 */
public class Solution002 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int l = 0 ;
        int r = array.length - 1;
        while(l < r){
            int mid = l + ((r - l) >> 1) ;
            int target = array[r];
            if(array[mid] < target){
                r = mid ;
            }else if(array[mid] > target){
                l = mid + 1;
            }else {
                r -- ;
            }
        }
        return array[r];
    }

    public static void main(String[] args) {
        new Solution002().minNumberInRotateArray(new int[]{3,4,5,1,2});
    }
}
