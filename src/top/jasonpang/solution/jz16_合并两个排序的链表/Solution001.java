package top.jasonpang.solution.jz16_合并两个排序的链表;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * @author Jason
 * Created in 2020-08-02 15:58.
 */
public class Solution001 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                cur.next = new ListNode(cur1.val);
                cur1 = cur1.next;
            }else{
                cur.next = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        while(cur1 != null){
            cur.next = new ListNode(cur1.val);
            cur1 = cur1.next;
            cur = cur.next;
        }
        while(cur2 != null){
            cur.next = new ListNode(cur2.val);
            cur2 = cur2.next;
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
