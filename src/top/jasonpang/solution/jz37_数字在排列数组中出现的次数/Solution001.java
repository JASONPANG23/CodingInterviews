package top.jasonpang.solution.jz37_数字在排列数组中出现的次数;

/**
 * description:
 * 统计一个数字在排序数组中出现的次数。
 * @author Jason
 * Created in 2020-08-08 20:50.
 */
public class Solution001 {
    public int GetNumberOfK(int [] array , int k) {
        if(array.length == 0){
            return 0;
        }
        int res = binarySearch(array, 0, array.length - 1, k);
        if(res == -1){
            return 0;
        }

        int cnt = 1;
        //上界
        for (int i = res + 1; i < array.length && array[i] == k; i++) {
            cnt ++ ;
        }
        //下界
        for (int i = res - 1; i >=0 && array[i] == k ; i--) {
            cnt ++;
        }
        return cnt ;
    }

    private int binarySearch(int [] arr,int l,int r,int target){
        int mid;
        while(l <= r){
            mid = l + ((r - l) >> 1);
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}
