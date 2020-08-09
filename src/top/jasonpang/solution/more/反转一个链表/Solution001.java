package top.jasonpang.solution.more.反转一个链表;

import top.jasonpang.solution.structure.ListNode;
import top.jasonpang.solution.utils.LinkListBuilder;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-25 14:00.
 */
public class Solution001 {

    public ListNode reversal(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode pre = null ;
        ListNode cur = head ;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre ;
            pre = cur;
            cur = next;
        }
        return pre ;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ListNode linkList = new LinkListBuilder<Integer>().buildFromArray(arr);
        linkList = new Solution001().reversal(linkList);
        String result = new LinkListBuilder<Integer>().print(linkList);
        System.out.println(result);
    }
}
