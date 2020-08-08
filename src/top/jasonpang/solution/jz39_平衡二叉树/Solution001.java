package top.jasonpang.solution.jz39_平衡二叉树;

import top.jasonpang.solution.structure.TreeNode;

/**
 * description:
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * @author Jason
 * Created in 2020-08-08 21:00.
 */
public class Solution001 {

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = IsBalanced_Solution(root.left, 0);
        int right = IsBalanced_Solution(root.right, 0);
        return Math.abs(left-right) <= 1;
    }

    private int IsBalanced_Solution(TreeNode root,int depth){
        if(root == null){
            return depth;
        }
        int left = IsBalanced_Solution(root.left, depth + 1);
        int right = IsBalanced_Solution(root.right, depth + 1);
        return Math.max(left,right);
    }

}
