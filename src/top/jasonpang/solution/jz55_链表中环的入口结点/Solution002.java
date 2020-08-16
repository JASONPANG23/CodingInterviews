package top.jasonpang.solution.jz55_链表中环的入口结点;

import top.jasonpang.solution.structure.ListNode;

import java.util.HashSet;

/**
 * description:(快慢指针)
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，
 * 否则，输出null。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution002 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        fast = pHead;
        while(fast != slow && slow.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
