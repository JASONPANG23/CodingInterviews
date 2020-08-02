package top.jasonpang.solution.jz17_树的子结构;

import top.jasonpang.solution.structure.TreeNode;

/**
 * description:
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 * @author Jason
 * Created in 2020-08-02 16:05.
 */
public class Solution001 {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //空树不是任意一个树的子结构
        if(root1 == null || root2 == null){
            return false ;
        }
        //检查子树
        if(root1.val == root2.val){
            if(judge(root1, root2)){
                return true;
            }
        }
        //递归到下层左右子树进行检查
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right,root2);
    }

    private boolean judge(TreeNode root1, TreeNode root2){
        //子结构遍历完，返回true
        if(root2 == null){
            return true;
        }
        //大树遍历完，子结构没有遍历完，返回false
        if(root1 == null){
            return false;
        }
        //校验根结点与左右两棵树是否匹配
        if(root1.val == root2.val){
            return judge(root1.left,root2.left) && judge(root1.right,root2.right);
        }else{
            return false;
        }
    }
}
