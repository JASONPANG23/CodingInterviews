package top.jasonpang.solution.jz56_删除有序链表中的重复元素;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-08-08 21:12.
 */
public class Solution001 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
        dummyHead.next = pHead;
        ListNode pre = dummyHead;
        ListNode cur = pHead;
        boolean flag = false;
        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
                flag = true;
            }
            if(flag){
                pre.next = cur.next;
                cur = cur.next ;
                flag = false;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
