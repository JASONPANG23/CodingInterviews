package top.jasonpang.solution.jz03_从尾到头打印链表;

import top.jasonpang.solution.structure.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-25 18:30.
 */
public class Solution001 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val) ;
            listNode = listNode.next;
        }
        ArrayList<Integer> result = new ArrayList<>(stack.size());
        while(!stack.empty()){
            result.add(stack.pop());
        }
        return result;
    }
}
