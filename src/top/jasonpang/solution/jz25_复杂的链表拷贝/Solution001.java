package top.jasonpang.solution.jz25_复杂的链表拷贝;

import top.jasonpang.solution.structure.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针random指向一个随机节点），
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。（
 * 注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author Jason
 * Created in 2020-08-03 22:36.
 */
public class Solution001 {

    public RandomListNode Clone(RandomListNode pHead){
        if(pHead == null){
            return null;
        }

        Map<RandomListNode,RandomListNode> help = new HashMap<>(8);
        RandomListNode cur = pHead;
        while(cur != null){
            RandomListNode copyNode = new RandomListNode(cur.label);
            help.put(cur,copyNode);
            cur = cur.next;
        }
        cur = pHead;
        RandomListNode dummyHead = new RandomListNode(0);
        RandomListNode resultCur = dummyHead;
        while(cur != null){
            RandomListNode node = help.get(cur);
            node.next = help.get(cur.next);
            node.random = help.get(cur.random);
            cur = cur.next;
            resultCur.next = node;
            resultCur = resultCur.next;
        }
        return dummyHead.next;
    }
}
