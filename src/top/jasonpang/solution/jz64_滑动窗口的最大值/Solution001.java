package top.jasonpang.solution.jz64_滑动窗口的最大值;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * description:
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}，
 * {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}，
 * {2,3,4,2,6,[2,5,1]}。
 * 窗口大于数组长度的时候，返回空
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> result = new ArrayList<>();
        if(num.length == 0 || size <= 0 || size > num.length){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(((o1, o2) -> {return o2 - o1;}));
        int count = 0;
        for (; count < size; count++) {
            maxHeap.offer(num[count]);
        }
        while(count < num.length){
            result.add(maxHeap.peek());
            maxHeap.remove(num[count - size]) ;
            maxHeap.offer(num[count++]);
        }
        result.add(maxHeap.peek());
        return result;
    }
}
