package top.jasonpang.solution.more.求完全二叉树节点个数;

import top.jasonpang.solution.structure.TreeNode;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-26 22:05.
 */
public class Solution001 {

    public int nodeNum(TreeNode head){
        if(head == null){
            return 0;
        }
        return bs(head,1,leftLevel(head,1));
    }

    private int bs(TreeNode node,int level,int height){
        if(height == level){
            return 1;
        }
        if(leftLevel(node.right,level + 1) == height){
            return (1 << (height - level)) + bs(node.right,level + 1,height);
        }else{
            return (1 << (height - level - 1)) + bs(node.left,level + 1,height);
        }
    }

    private int leftLevel(TreeNode head,int level){
        while(head != null){
            head = head.left;
            level ++ ;
        }
        return level - 1;
    }


}
