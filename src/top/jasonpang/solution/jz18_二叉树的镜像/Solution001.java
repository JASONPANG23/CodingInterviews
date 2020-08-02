package top.jasonpang.solution.jz18_二叉树的镜像;

import top.jasonpang.solution.structure.TreeNode;

/**
 * description:
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author Jason
 * Created in 2020-08-02 16:36.
 */
public class Solution001 {
    public void Mirror(TreeNode root) {
        if(root == null){
            return ;
        }
        Mirror(root.left);
        Mirror(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
