package top.jasonpang.solution.more.快排的partition;

/**
 * description:
 * 给定一个数组arr,和一个数num,请把小于num的数放在数组的左边,大于放在数组右边
 * @author Jason
 * Created in 2020-08-02 14:20.
 */
public class Solution001 {
    public int partition(int[] arr,int num){
        //[0...x]为小于等于num的范围
        int x = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= num && ++x != i){
                swap(arr,x,i);
            }
        }
        return x;
    }

    private void swap(int[] arr,int a,int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    public static void main(String[] args) {
        int[] arr = {3, 1,545,3,5,6,765,87,5,78,46,4};
        int num = 4;
        int p = new Solution001().partition(arr,num);
        System.out.println(p);
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}
