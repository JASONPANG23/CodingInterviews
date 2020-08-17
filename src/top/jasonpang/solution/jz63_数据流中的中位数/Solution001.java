package top.jasonpang.solution.jz63_数据流中的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * description:(小根堆 + 大根堆)
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {

    /**
     * 小根堆
     */
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            }
    );

    /**
     * 大根堆
     */
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            }
    );

    private int count = 0;

    public void Insert(Integer num) {
        if(count % 2 == 0){
            minHeap.offer(num);
            int maxOfMaxHeap = minHeap.poll();
            maxHeap.offer(maxOfMaxHeap);
        }else{
            maxHeap.offer(num);
            int minOfMinHeap = maxHeap.poll();
            minHeap.offer(minOfMinHeap);
        }
        count ++ ;
    }

    public Double GetMedian() {
        if(minHeap.isEmpty() && maxHeap.isEmpty()){
            return 0.;
        }
        if(count % 2 ==0){
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
        return maxHeap.peek() + .0;
    }
}
