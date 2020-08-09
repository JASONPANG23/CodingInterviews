package top.jasonpang.solution.jz26二叉搜索树与双向链表;

import top.jasonpang.solution.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author Jason
 * Created in 2020-08-05 22:53.
 */
public class Solution001 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        List<TreeNode> res = new ArrayList<>(10);
        inOrder(pRootOfTree,res);
        TreeNode pre = null;
        for (int i = 0; i < res.size(); i++) {
            res.get(i).left = pre ;
            if(i != res.size() - 1){
                res.get(i).right = res.get(i + 1);
            }
            pre = res.get(i);
        }
        return res.get(0);
    }

    private void inOrder(TreeNode treeNode,List<TreeNode> res){
        if(treeNode == null){
            return;
        }
        if(treeNode.left != null){
            inOrder(treeNode.left, res);
        }
        res.add(treeNode);
        if(treeNode.right != null){
            inOrder(treeNode.right, res);
        }
    }
}
