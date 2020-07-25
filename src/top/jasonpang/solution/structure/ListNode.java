package top.jasonpang.solution.structure;

/**
 * description:
 * 链表节点
 * @author Jason
 * Created in 2020-07-25 12:58.
 */
public class ListNode<T> {
    public T val ;
    public ListNode next;
    public ListNode(){}
    public ListNode(T x){
        val = x;
    }
}
