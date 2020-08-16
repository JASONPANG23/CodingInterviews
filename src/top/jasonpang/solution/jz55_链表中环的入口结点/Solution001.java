package top.jasonpang.solution.jz55_链表中环的入口结点;

import top.jasonpang.solution.structure.ListNode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * description:
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，
 * 否则，输出null。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        ListNode cur = pHead;
        HashSet<ListNode> set = new HashSet<>();
        while(cur != null){
            if(set.contains(cur)){
                return cur;
            }
            set.add(cur);
            cur = cur.next;
        }
        return null;
    }
}
