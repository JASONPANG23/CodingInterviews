package top.jasonpang.solution.more.快慢指针;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution {
    /**
     * 输入链表头节点，奇数长度返回中点，偶数长度返回上中点
     */
    public static ListNode fun1(ListNode head){
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head.next.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 输入链表头节点，奇数长度返回中点，偶数长度返回下中点
     * @param head
     * @return
     */
    public static ListNode fun2(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 输入链表头节点，奇数长度返回中点前一个，偶数长度返回上中点前一个
     * @param head
     * @return
     */
    public static ListNode fun3(ListNode head){
        if(head == null || head.next == null || head.next.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 输入链表头节点，奇数长度返回中点前一个，偶数长度返回下中点前一个
     * @param head
     * @return
     */
    public static ListNode fun4(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        if(head.next.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
