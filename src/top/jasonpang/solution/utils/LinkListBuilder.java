package top.jasonpang.solution.utils;

import top.jasonpang.solution.structure.ListNode;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-25 14:07.
 */
public class LinkListBuilder<T> {

    public ListNode<T> buildFromArray(T[] arr){
        if(arr == null || arr.length == 0){
            return null ;
        }
        ListNode<T> dummyHead = new ListNode<>();
        ListNode<T> cur = dummyHead ;
        for (T item : arr){
            ListNode<T> node = new ListNode<>(item);
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
