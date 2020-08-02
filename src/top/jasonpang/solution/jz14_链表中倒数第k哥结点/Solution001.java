package top.jasonpang.solution.jz14_链表中倒数第k哥结点;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author Jason
 * Created in 2020-08-02 15:46.
 */
public class Solution001 {
    public ListNode FindKthToTail(ListNode head, int k) {
        int count = 0 ;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            count ++ ;
        }
        if(k > count){
            return null;
        }
        int index = count - k ;
        cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
