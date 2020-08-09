package top.jasonpang.solution.jz36_两个链表的第一个公共结点;

import top.jasonpang.solution.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * description:
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * @author Jason
 * Created in 2020-08-08 17:34.
 */
public class Solution002 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        // 如果只要两个链表的长度是一样的话就好办了
        // 思考一种情况 a + b = b + a
        // a指针走链路1与链路2的路程
        // b指针也走链路1与链路2的路程
        // 时间复杂度:O(n+m)
        // 空间复杂度:O(1)
        ListNode a = pHead1 ;
        ListNode b = pHead2 ;
        while(a != b){
            a = (a != null) ? a.next : pHead2;
            b = (b != null) ? b.next : pHead1;
        }
        return a;
    }
}
