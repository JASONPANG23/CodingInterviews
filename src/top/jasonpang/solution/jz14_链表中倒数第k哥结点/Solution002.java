package top.jasonpang.solution.jz14_链表中倒数第k哥结点;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 * 输入一个链表，输出该链表中倒数第k个结点。(快慢指针)
 * 严格的O(n)时间复杂度
 * @author Jason
 * Created in 2020-08-02 15:51.
 */
public class Solution002 {

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        //快指针先走k步
        for (int i = 0; i < k; i++) {
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        //快指针和慢指针一起走
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
