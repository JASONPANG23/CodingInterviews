package top.jasonpang.solution.more.判断一个链表是否是回文结构;

import top.jasonpang.solution.structure.ListNode;

import java.util.Stack;

/**
 * description:
 * 使用栈结构解决问题
 * @author Jason
 * Created in 2020-07-25 11:10.
 */
public class Solution001 {
    public boolean palindrome(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head ;
        while(cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        cur = head ;
        while(cur != null){
            if(!stack.pop().equals(cur.val)){
                return false ;
            }
            cur = cur.next;
        }
        return true ;
    }

    public static void main(String[] args) {

    }
}
