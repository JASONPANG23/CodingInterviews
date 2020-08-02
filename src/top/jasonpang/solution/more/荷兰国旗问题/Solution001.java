package top.jasonpang.solution.more.荷兰国旗问题;

/**
 * description:
 * 给定一个数组arr,和一个数num,请把小于num的数放在数组的左边
 * 等于放在数组中间，大于放在数组右边
 * @author Jason
 * Created in 2020-08-02 14:19.
 */
public class Solution001 {


    public void function(int [] arr,int num){
        //[0...less]    小于num
        //(less,cur)    等于num
        //[cur...length]  大于num
        int less = - 1 ;
        int more = arr.length ;
        int cur = 0;
        while(cur < more){
            if(arr[cur] < num){
                swap(arr,cur++,++less);
            }
            else if(arr[cur] > num){
                swap(arr,cur,--more);
            }else{
                cur ++;
            }
        }
        System.out.println("小于区域 :[0..."+less+"]");
        System.out.println("等于区域 :("+less+"..."+cur+")");
        System.out.println("大于区域 :["+cur+"..."+arr.length+"]");
    }

    private void swap(int[] arr,int a,int b){
        int temp = arr[a] ;
        arr[a] = arr[b]  ;
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1,545,3,5,6,765,87,5,78,46,4};
        int num = 4;
        new Solution001().function(arr,num);
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}
