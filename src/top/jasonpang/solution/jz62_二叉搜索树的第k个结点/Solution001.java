package top.jasonpang.solution.jz62_二叉搜索树的第k个结点;

import top.jasonpang.solution.structure.TreeNode;

import java.util.Stack;

/**
 * Description:
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）
 * 中，按结点数值大小顺序第三小结点的值为4。
 * @author pangjiesheng
 * Created in  2020/8/28
 */
public class Solution001 {

    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot == null){
            return null ;
        }
        int index = 0 ;
        Stack<TreeNode> stack = new Stack<>();
        while(pRoot != null || !stack.isEmpty()){
            if(pRoot != null){
                stack.push(pRoot);
                pRoot = pRoot.left;
            }else{
                TreeNode node = stack.pop();
                index ++ ;
                if(index == k){
                    return node ;
                }
                pRoot = node.right;
            }
        }
        return null ;
    }
}
