package top.jasonpang.solution.jz29_最小的k个元素;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * description:
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * @author Jason
 * Created in 2020-08-08 10:24.
 */
public class Solution001 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if(input == null || input.length == 0 || k <= 0 || input.length < k){
            return result;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(input.length);
        for (int value : input){
            queue.add(value);
        }

        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }
        return result;
    }
}
