package top.jasonpang.solution.jz22_从上往下打印二叉树;

import top.jasonpang.solution.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * description:
 * 从上往下打印出二叉树的每个节点，
 * 同层节点从左至右打印。
 * @author Jason
 * Created in 2020-08-03 21:13.
 */
public class Solution001 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            result.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return result;
    }
}
