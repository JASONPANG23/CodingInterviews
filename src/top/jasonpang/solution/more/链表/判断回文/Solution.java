package top.jasonpang.solution.more.链表.判断回文;

import top.jasonpang.solution.structure.ListNode;

import java.util.Stack;

/**
 * description:
 * 验证一个链表回文
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution {

    /**
     * 使用栈结构
     * @return
     */
    public static boolean fun1(ListNode head){
        if(head == null){
            return false;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            stack.add(cur);
            cur = cur.next;
        }
        cur = head;
        while(!stack.isEmpty()){
            if(stack.pop().val != cur.val){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }

    /**
     * 快慢指针
     * @return
     */
    public static boolean fun2(ListNode head){
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //将slow 到 fast 之间的链表反转
        ListNode pre = slow;
        ListNode cur = slow.next;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        ListNode head2 = pre;


        cur = head;
        ListNode cur2 = head2;
        while(cur != null && cur2 != null){
            if(cur.val != cur2.val){
                return false;
            }
            cur = cur.next;
            cur2 = cur2.next;
        }

        return true;
    }
}
