package top.jasonpang.solution.more.二叉树前中后序遍历;

import top.jasonpang.solution.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * description:
 *
 * @author Jason
 * Created in 2020-07-26 10:06.
 */
public class Solution001 {

    public List<Integer> preOrder(TreeNode root){
        if(root == null){
            return new ArrayList<>(0);
        }
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> help = new Stack<>();
        help.push(root) ;
        while(!help.isEmpty()){
            TreeNode node = help.pop();
            result.add(node.val);
            if(node.right != null){
                help.push(node.right);
            }
            if(node.left != null){
                help.push(node.left);
            }
        }
        return result;
    }

    public List<Integer> inOrder(TreeNode root){
        if(root == null){
            return new ArrayList<>(0);
        }
        List<Integer> result = new ArrayList<>() ;
        Stack<TreeNode> help = new Stack<>();
        while(root != null || !help.isEmpty()){
            if(root != null){
                help.push(root);
                root = root.left;
            }else{
                TreeNode node = help.pop();
                result.add(node.val);
                root = node.right;
            }
        }
        return result;
    }

    /**
     * 后序遍历的顺序是 左右中 ，但是手工压栈的方式只能访问到某个节点两次
     * 而后续遍历往往需要访问一个节点的第三次才进行打印，所以需要其他技巧
     * 可以按照前序遍历的思路，实现一个 中右左 的遍历方式，再将这个结果反转过来
     * 就是后续遍历的结果，反转一个序列最常用的方式就是栈
     * @param root
     * @return
     */
    public List<Integer> posOrder(TreeNode root){
        if(root == null){
            return new ArrayList<>(0);
        }
        List<Integer> result = new ArrayList<>() ;
        Stack<TreeNode> help1 = new Stack<>();
        Stack<TreeNode> help2 = new Stack<>();
        help1.push(root);
        while(!help1.isEmpty()){
            TreeNode node = help1.pop();
            help2.push(node);
            if(node.left != null){
                help1.push(node.left) ;
            }
            if(node.right != null){
                help1.push(node.right);
            }
        }
        while(!help2.isEmpty()){
            result.add(help2.pop().val);
        }
        return result;
    }
}
