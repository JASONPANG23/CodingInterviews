package top.jasonpang.solution.jz35_数组中的逆序对;

/**
 * description:
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    private int count = 0;
    private int mod = (int) 1e9 + 7;

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        mergeSort(array, 0, array.length - 1);
        return count;
    }

    private void mergeSort(int[] array, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        mergeSort(array, l, mid);
        mergeSort(array, mid + 1, r);
        merge(array,l,r,mid);
    }

    private void merge(int[] array, int l, int r, int mid) {
        int[] t = new int[r - l + 1];
        int k = 0;
        int i = l ;
        int j = mid + 1;
        while(i <= mid && j <= r){
            if(array[i] <= array[j]){
                t[k++] = array[i++];
            }else {
                //计算逆序对
                //当i位置的数大于j位置的数，那么【i...mid】的数也会大于j位置的数
                count = ( count + mid - i + 1) % mod ;
                t[k++] = array[j++];
            }
        }

        while(i <= mid){
            t[k++] = array[i++];
        }
        while(j <= r){
            t[k++] = array[j++];
        }

        for (int m = 0; m < t.length; m++) {
            array[l + m] = t[m];
        }
    }
}
