package top.jasonpang.solution.jz15_反转链表;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author Jason
 * Created in 2020-08-02 15:56.
 */
public class Solution001 {
    public ListNode ReverseList(ListNode head) {

        ListNode pre = null ;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre ;
            pre = cur ;
            cur = next;
        }
        return pre ;
    }
}
