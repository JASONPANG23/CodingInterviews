package top.jasonpang.solution.jz38_二叉树的深度;

import top.jasonpang.solution.structure.TreeNode;

/**
 * description:
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）
 * 形成树的一条路径，最长路径的长度为树的深度。
 * @author Jason
 * Created in 2020-08-08 15:10.
 */
public class Solution001 {
    public int TreeDepth(TreeNode root) {
        return TreeDepth(root,0);
    }

    private int TreeDepth(TreeNode root,int depth){
        if(root == null){
            return depth;
        }
        return Math.max(TreeDepth(root.left,depth + 1),TreeDepth(root.right, depth + 1)) ;
    }
}
