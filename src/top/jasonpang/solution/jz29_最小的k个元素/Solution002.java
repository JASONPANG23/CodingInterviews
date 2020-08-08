package top.jasonpang.solution.jz29_最小的k个元素;

import java.util.ArrayList;

/**
 * description:
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * @author Jason
 * Created in 2020-08-08 10:40.
 */
public class Solution002 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>(input.length);
        if(input.length == 0 || k <= 0 || input.length < k){
            return res;
        }
        int l = 0;
        int r = input.length - 1;
        int p;
        k = k - 1 ;
        do{
            p = partition(input, l, r);
            if(p < k){
                l = p + 1;
            }else{
                r = p - 1;
            }
        }while (p != k);


        for (int i = 0; i < p + 1; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private int partition(int [] arr ,int l,int r){
        int v = arr[l] ;
        //[l..i) 小于等于v
        int i = l + 1 ;
        //(j..r] 大于等于v
        int j = r ;
        while(true){
            while(i <= j && arr[i] <= v){
                i ++ ;
            }
            while(i <= j && arr[j] > v){
                j --;
            }
            if(i > j){
                break;
            }
            swap(arr,i,j);
            i ++ ;
            j -- ;
        }
        swap(arr,l,j);
        return j;
    }

    private void swap(int [] arr,int a,int b){
        if(a == b) {
            return ;
        }
        arr[a] = arr[a] ^ arr[b] ;
        arr[b] = arr[a] ^ arr[b] ;
        arr[a] = arr[a] ^ arr[b] ;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new Solution002().GetLeastNumbers_Solution(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 8);
        for (int value : result){
            System.out.print(value+" ");
        }
    }
}
