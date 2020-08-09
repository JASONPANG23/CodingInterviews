package top.jasonpang.solution.jz36_两个链表的第一个公共结点;
import top.jasonpang.solution.structure.ListNode;
import java.util.HashSet;
import java.util.Set;
/**
 * description:
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * @author Jason
 * Created in 2020-08-08 17:24.
 */
public class Solution001 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<ListNode> set = new HashSet<>();
        for (ListNode cur = pHead1 ; cur != null ; cur = cur.next){
            set.add(cur);
        }
        for (ListNode cur = pHead2 ; cur != null ; cur = cur.next){
            if(set.contains(cur)){
                return cur ;
            }
        }
        return null;
    }
}
