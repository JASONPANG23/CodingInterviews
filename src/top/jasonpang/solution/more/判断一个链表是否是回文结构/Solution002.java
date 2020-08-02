package top.jasonpang.solution.more.判断一个链表是否是回文结构;

import top.jasonpang.solution.more.反转一个链表.Solution001;
import top.jasonpang.solution.structure.ListNode;
import top.jasonpang.solution.utils.LinkListBuilder;

/**
 * description:
 * O(1)的空间复杂度
 * @author Jason
 * Created in 2020-07-25 11:12.
 */
public class Solution002 {

    public boolean palindrome(ListNode head){
        if(head == null){
            // 空串算回文串
            return true ;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode n2 = new Solution001().reversal(slow);

        ListNode n1 = head ;
        while(n2.next != null){
            if(n1.val != n2.val ){
                return false ;
            }
            n2 = n2.next;
            n1 = n1.next;
        }
        return true ;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        ListNode linkList = new LinkListBuilder<Integer>().buildFromArray(arr);
        boolean result = new top.jasonpang.solution.more.判断一个链表是否是回文结构.Solution002().palindrome(linkList);
        System.out.println(result);
    }

}
