package top.jasonpang.solution.utils;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-25 14:07.
 */
public class LinkListBuilder<T> {

    public ListNode buildFromArray(int [] arr){
        if(arr == null || arr.length == 0){
            return null ;
        }
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead ;
        for (int item : arr){
            ListNode node = new ListNode(item);
            cur.next = node ;
            cur = node ;
        }
        return dummyHead.next;
    }

    public String print(ListNode node){
        StringBuilder stringBuilder = new StringBuilder();
        while(node != null){
            stringBuilder.append(node.val).append("=>") ;
            node = node.next;
        }
        stringBuilder.append("null") ;
        return stringBuilder.toString();
    }
}
