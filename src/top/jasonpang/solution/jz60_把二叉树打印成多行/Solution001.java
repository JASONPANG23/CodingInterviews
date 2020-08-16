package top.jasonpang.solution.jz60_把二叉树打印成多行;

import top.jasonpang.solution.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * description:
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null){
            return result;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(pRoot);
        do {
            ArrayList<Integer> subRes = new ArrayList<>();
            while (!queue1.isEmpty()) {
                TreeNode node = queue1.poll();
                subRes.add(node.val);
                if (node.left != null) {
                    queue2.add(node.left);
                }
                if (node.right != null) {
                    queue2.add(node.right);
                }
            }
            if (!subRes.isEmpty()) {
                result.add(subRes);
            }
            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
        } while (!queue1.isEmpty());
        return result;
    }
}
